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
    public boolean isSymmetric(TreeNode root) {
        return help(root.left,root.right);
    }
    public boolean help(TreeNode p,TreeNode q){
        if(p==null&&q==null)return true;
        if(p==null||q==null||p.val!=q.val)return false;
        return help(p.left,q.right)&&help(p.right,q.left);
    }
}