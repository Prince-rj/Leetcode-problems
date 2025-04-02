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
        if(root==null)return 0;
        int curr=help(root.left)+help(root.right);
        int l=diameterOfBinaryTree(root.left);
        int r=diameterOfBinaryTree(root.right);
        return Math.max(curr,Math.max(l,r));
    }
    public int help(TreeNode root){
        if(root==null)return 0;
        int l=help(root.left);
        int r=help(root.right);
        return 1+Math.max(l,r);
    }
}