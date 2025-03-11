class Solution {
    public boolean canJump(int[] nums) {
        int furthest=nums[0];
        for(int i=1;i<nums.length-1;i++){
            // System.out.println(furthest);
            if(furthest>=i)furthest=Math.max(furthest,nums[i]+i);
            else return false;
        }
        // System.out.println(furthest);

        return furthest>=nums.length-1;
        // 2 3 0 1 4
        // 3 2 1 0 4
    }
}