class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        vector<int> temp(nums.size());
        int prev=0;
        for(int i=0;i<nums.size();i++){
            temp[i]=prev+nums[i];
            prev=temp[i];
        }
        for(int i=0;i<nums.size();i++){
            int a=temp[i]-nums[i];
            int b=temp[nums.size()-1]-temp[i];
            if(a==b)return i;
        }
        return -1;
    }
};