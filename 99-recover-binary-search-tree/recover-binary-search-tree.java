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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        help(root,arr);
        Collections.sort(arr);
        trav(root,arr,new int[]{0});
    }
    public void help(TreeNode root,ArrayList<Integer> arr){
        if(root==null)return;
        help(root.left,arr);
        arr.add(root.val);
        help(root.right,arr);
    }
    public void trav(TreeNode root,ArrayList<Integer> arr, int[] ind){
        if(root==null)return;
        trav(root.left,arr,ind);
        root.val=arr.get(ind[0]);
        ind[0]++;
        trav(root.right,arr,ind);
    }
}