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
        Pair(TreeNode root,int horlev){
            this.root=root;
            this.horlev=horlev;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int val=0;
        while(!q.isEmpty()){
            int n=q.size();
            int fir=-1;
            int las=0;
            for(int i=0;i<n;i++){
                TreeNode temp=q.peek().root;
                int horlev=q.peek().horlev;
                q.poll();
                if(temp.left!=null)q.add(new Pair(temp.left,horlev*2+1));
                if(temp.right!=null)q.add(new Pair(temp.right,horlev*2+2));
                if(fir==-1)fir=horlev;
                las=horlev;
            }
            int v=las-fir+1;
            val=Math.max(val,v);
        }
        return val;
    }
}