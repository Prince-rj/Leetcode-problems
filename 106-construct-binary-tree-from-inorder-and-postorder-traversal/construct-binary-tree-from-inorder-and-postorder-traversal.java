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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return help(inorder,postorder,new int[]{postorder.length-1},0,postorder.length-1);
    }
    public TreeNode help(int[] in,int[] post,int[] ind,int l,int r){
        if(l>r)return null;
        int index=find(in,post[ind[0]]);
        ind[0]-=1;
        TreeNode root=new TreeNode(in[index]);
        root.right=help(in,post,ind,index+1,r);
        root.left=help(in,post,ind,l,index-1);
        return root;
    }
    public int find(int[] arr,int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val)return i;
        }
        return 0;
    }
}