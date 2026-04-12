class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int i=0;
        int j=0;
        int ans=INT_MAX;
        int sum=0;
        while(i<nums.size()){
            if(sum+nums[i]<target){
                sum+=nums[i];
                i++;
            }
            else{
                ans=min(ans,i-j+1);
                sum-=nums[j];
                j++;
            }
        }
        return (ans==INT_MAX)?0:ans;

    }
};