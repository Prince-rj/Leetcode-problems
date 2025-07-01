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
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode ptr=root;
        List<Integer> li=new ArrayList<>();
        while(ptr!=null){
            if(ptr.left!=null){
                TreeNode prev=ptr.left;
                
                while(prev.right!=null&&prev.right!=ptr)prev=prev.right;
                if(prev.right==ptr){
                    prev.right=null;
                    // li.add(ptr.val);
                    ptr=ptr.right;
                }
                else{
                    prev.right=ptr;
                    li.add(ptr.val);
                    ptr=ptr.left;
                } 
            }
            else{
                li.add(ptr.val);
                ptr=ptr.right;
            }
        }
        return li;
    }
}