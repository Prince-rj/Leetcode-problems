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
        HashMap<TreeNode, Integer> hm=new HashMap<>();
        return diam(root,hm);
    }
    public int diam(TreeNode root,HashMap<TreeNode,Integer> hm){
        if(root==null)return 0;
        int x=0;
        int y=0;
        if(!hm.containsKey(x))x=help(root.left,hm);
        else x=hm.get(root.left);
        if(!hm.containsKey(y))y=help(root.right,hm);
        else x=hm.get(root.right);
        int curr=x+y;
        int l=diam(root.left,hm);
        int r=diam(root.right,hm);
        return Math.max(curr,Math.max(l,r));
    }
    public int help(TreeNode root,HashMap<TreeNode,Integer> hm){
        if(root==null)return 0;
        int l=help(root.left,hm);
        int r=help(root.right,hm);
        int v=1+Math.max(l,r);
        hm.put(root,v);
        return v;
    }
}