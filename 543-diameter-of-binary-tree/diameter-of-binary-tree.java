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
    public int diameterOfBinaryTree(TreeNode root) {
        int arr[]={0};
        help(root,arr);
        return arr[0];
    }
    public int help(TreeNode root,int[] arr){
        if(root==null)return 0;
        int l=help(root.left,arr);
        int r=help(root.right,arr);
        arr[0]=Math.max(l+r,arr[0]);
        return 1+Math.max(l,r);
    }
}