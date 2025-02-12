class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Long,PriorityQueue<Integer>> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            long x=sumOfDig(nums[i]);
            if(!hm.containsKey(x))hm.put(x,new PriorityQueue<>(Collections.reverseOrder()));
            hm.get(x).add(nums[i]);
        }
        int ans=0;
        for(var i:hm.entrySet()){
            int a=0,b=0;
            a=i.getValue().poll();
            if(i.getValue().isEmpty())continue;
            else b=i.getValue().poll();
            ans=Math.max(ans,a+b);
        }
        return (ans==0)?-1:ans;
    }
    public long sumOfDig(int n){
        long s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}