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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        while(!q.isEmpty()){
            List<Integer> li=new ArrayList<>();
            // System.out.println(q.size());
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                if(flag)li.add(temp.val);
                else li.add(0,temp.val);
            }
            flag=!flag;
            ans.add(li);
        }
        return ans;
    }
}