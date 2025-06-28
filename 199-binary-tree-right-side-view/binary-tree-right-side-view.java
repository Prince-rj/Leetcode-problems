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
    class Pair{
        TreeNode root;
        int horlev;
        int verlev;
        Pair(TreeNode root,int horlev,int verlev){
            this.root=root;
            this.horlev=horlev;
            this.verlev=verlev;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        if(root == null)return arr;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0,0));
        
        while(!q.isEmpty()){
            int n=q.size();
            int v=0;
            for(int i=0;i<n;i++){
                TreeNode tem=q.peek().root;
                int horlev=q.peek().horlev;
                int verlev=q.peek().verlev;
                q.poll();
                if(tem.left!=null)q.add(new Pair(tem.left,horlev-1,verlev+1));
                if(tem.right!=null)q.add(new Pair(tem.right,horlev+1,verlev+1));
                v=tem.val;
            }
            arr.add(v);
        }
        
        return arr;
        
    }
}