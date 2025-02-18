class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(var i:nums)hm.put(i,hm.getOrDefault(i,0)+1);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            return b[1]-a[1];
        });
        for(var i:hm.entrySet()){
            pq.add(new int[]{i.getKey(),i.getValue()});
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[0];
        }
        return ans;
    }
}