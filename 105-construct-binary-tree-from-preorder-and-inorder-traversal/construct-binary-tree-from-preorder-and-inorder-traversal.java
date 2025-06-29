/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder,inorder,0,inorder.length-1,new int[]{0});
    }
    public TreeNode help(int[] preorder,int[] inorder,int l,int r,int[] ind){
        if(l>r)return null;
        TreeNode root=new TreeNode(preorder[ind[0]]);
        int index=find(inorder,preorder[ind[0]]);
        ind[0]++;
        root.left=help(preorder,inorder,l,index-1,ind);
        root.right=help(preorder,inorder,index+1,r,ind);
        return root;
    }
    public int find(int[] arr,int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val)return i;
        }
        return -1;
    }
}