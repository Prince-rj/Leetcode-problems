class Solution {
public:
    int maxProfit(vector<int>& prices, int fee) {
        vector<vector<int>> dp(prices.size(),vector<int>(2,INT_MIN));
        return help(0,0,prices,fee,dp);
    }
    int help(int i,int b,vector<int>& arr,int fee,vector<vector<int>>& dp){
        if(i==arr.size())return 0;
        if(dp[i][b]!=INT_MIN)return dp[i][b];
        int op1=INT_MIN,op2=INT_MIN,op3=INT_MIN,op4=INT_MIN;
        if(b==0){
            op1=(-1*arr[i])+help(i+1,1,arr,fee,dp);
            op2=help(i+1,0,arr,fee,dp);
        }
        else{
            op3=arr[i]+help(i+1,0,arr,fee,dp)-fee;
            op4=help(i+1,1,arr,fee,dp);
        }
        return dp[i][b]=max(op1,max(op2,max(op3,op4)));
    }
};