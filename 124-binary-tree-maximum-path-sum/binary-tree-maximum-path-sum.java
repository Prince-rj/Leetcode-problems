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
    public int maxPathSum(TreeNode root) {
        int[] arr={Integer.MIN_VALUE};
        help(root,arr);
        return arr[0];
    }
    public int help(TreeNode root,int[] arr){
        if(root==null)return 0;
        int l=Math.max(0,help(root.left,arr));
        int r=Math.max(0,help(root.right,arr));
        arr[0]=Math.max(arr[0],l+r+root.val);
        return Math.max(l,r)+root.val;
    }
}