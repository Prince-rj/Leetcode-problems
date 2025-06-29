/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        traverse(root,hm);
        Queue<int[]> q=new LinkedList<>();
        HashSet hs=new HashSet<>();
        q.add(new int[]{target.val,0});
        while(!q.isEmpty()){
            int temp[]=q.poll();
            hs.add(temp[0]);
            if(temp[1]==k)ans.add(temp[0]);
            for(var i:hm.get(temp[0])){
                if(!hs.contains(i))q.add(new int[]{i,temp[1]+1});
            }
        }
        return ans;

    }
    public void traverse(TreeNode root,HashMap<Integer,ArrayList<Integer>> hm){
        if(root==null)return;
        if(!hm.containsKey(root.val))hm.put(root.val,new ArrayList<>());
        if(root.left!=null){
            hm.get(root.val).add(root.left.val);
            if(!hm.containsKey(root.left.val))hm.put(root.left.val,new ArrayList<>());
            hm.get(root.left.val).add(root.val);
        }
        if(root.right!=null){
            hm.get(root.val).add(root.right.val);
            if(!hm.containsKey(root.right.val))hm.put(root.right.val,new ArrayList<>());
            hm.get(root.right.val).add(root.val);
        }
        traverse(root.left,hm);
        traverse(root.right,hm);
    }
    
}