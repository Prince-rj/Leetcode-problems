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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        help(root,li);
        return li;
    }
    public void help(TreeNode root,List<Integer> li){
        if(root==null)return;
        help(root.left,li);
        help(root.right,li);
        li.add(root.val);
    }
}