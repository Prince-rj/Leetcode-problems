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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null)return 1;
        if(root.right==null)return 2;
        int l=left_height(root);
        int r=right_height(root);
        if(l==r)return (int)Math.pow(2,l)-1;
        else return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int left_height(TreeNode root){
        if(root==null)return 0;
        return 1+left_height(root.left);

    }
    public int right_height(TreeNode root){
        if(root==null)return 0;
        return 1+right_height(root.right);
    }
}