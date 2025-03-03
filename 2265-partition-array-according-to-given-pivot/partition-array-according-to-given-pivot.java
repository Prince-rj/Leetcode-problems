class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot)ans[ind++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot)ans[ind++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot)ans[ind++]=nums[i];
        }
        return ans;
    }
}