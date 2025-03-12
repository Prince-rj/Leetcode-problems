class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)return 0;
        int far=nums[0];
        int ed=nums[0];
        int j=1;
        if(far>=nums.length-1)return j;
        for(int i=1;i<nums.length-1;i++){
            // System.out.println(j+" "+nums[i]);
            if(nums[i]+i>far){
                far=nums[i]+i;
            }
            if(ed<=i){
                j++;
                ed=far;
            }
            if(ed>=nums.length-1)return j;
        }
        return j;

    }
}