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
 class Node{
    TreeNode root;
    int level;
    int verlevel;
    
    Node(TreeNode root,int level,int verlevel){
        this.root=root;
        this.level=level;
        this.verlevel=verlevel;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,LinkedHashMap<Integer,PriorityQueue<Integer>>> hm=new TreeMap<>();
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(root,0,0));
        while(!q.isEmpty()){
            Node t=q.poll();
            if(t.root.left!=null)q.add(new Node(t.root.left,t.level+1,t.verlevel-1));
            if(t.root.right!=null)q.add(new Node(t.root.right,t.level+1,t.verlevel+1));
            if(!hm.containsKey(t.verlevel)){
                hm.put(t.verlevel,new LinkedHashMap<>());
            }
            if(!hm.get(t.verlevel).containsKey(t.level)){
                hm.get(t.verlevel).put(t.level,new PriorityQueue<>());
            }
            hm.get(t.verlevel).get(t.level).add(t.root.val);
        }
        List<List<Integer>> li=new ArrayList<>();
        for(var i:hm.entrySet()){
            List<Integer> t=new ArrayList<>();
            for(var j:i.getValue().entrySet()){
                while(!j.getValue().isEmpty()){
                    t.add(j.getValue().poll());
                }
            }
            li.add(t);
        }
        return li;
    }
}