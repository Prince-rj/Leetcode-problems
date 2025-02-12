class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Long,Integer> hm=new HashMap<>();
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            long x=sumOfDig(nums[i]);
            if(!hm.containsKey(x))hm.put(x,nums[i]);
            else{
                ans=Math.max(ans,hm.get(x)+nums[i]);
                hm.put(x,Math.max(nums[i],hm.get(x)));
            }
        }
        return ans;
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