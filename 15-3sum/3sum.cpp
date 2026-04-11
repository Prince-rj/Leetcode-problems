class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        for(int a=0;a<nums.size();){
            int i=a+1;
            int j=nums.size()-1;
            int sum=-nums[a];
            int aval=nums[a];
            while(i<j){
                int val=nums[i]+nums[j];
                // cout<<val<<" "<<sum<<endl;
                if(val>sum)j--;
                else if(val<sum) i++;
                else{
                    vector<int> temp;
                    temp.push_back(nums[a]);
                    temp.push_back(nums[i]);
                    temp.push_back(nums[j]);
                    ans.push_back(temp);
                    int ival=nums[i];
                    int jval=nums[j];
                    while(i<j&&nums[i]==ival)i++;
                    while(i<j&&nums[j]==jval)j--;
                }
            }
            while(a<nums.size()&&nums[a]==aval)a++;

        }
        return ans;
    }
};