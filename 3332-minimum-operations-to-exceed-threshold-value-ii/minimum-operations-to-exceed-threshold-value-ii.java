class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)pq.add((long)nums[i]);
        int i=0;
        while(!pq.isEmpty()&&pq.peek()<k){
            i++;
            long a=pq.poll();
            // if(pq.isEmpty())
            long b=pq.poll();
            pq.add(Math.min(a,b)*2+Math.max(a,b));
        }
        return i;
    }
}