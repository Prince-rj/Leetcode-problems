class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return help(nums,k)-help(nums,k-1);
    }
    public int help(int[] nums,int k){
        //function to find with at most k distinct elements
        int i=0;
        int j=0;
        int val=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        // int cnt=0;
        while(i<nums.length){
            hm.put(nums[i],i);
            if(hm.size()>k){
                while(j<nums.length&&hm.size()>k){
                    if(hm.get(nums[j])==j)hm.remove(nums[j]);
                    j++;
                }
            }
            val+=i-j+1;
            i++;
        }
        
        return val;
    }
}