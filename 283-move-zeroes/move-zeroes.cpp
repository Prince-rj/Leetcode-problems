class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i=0,j=0;
        while(i<nums.size()){
            if(nums[i]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else{
                i++;
            }
        }
    }
    void swap(vector<int>& arr,int i ,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
};