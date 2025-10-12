class Solution {
public:
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m,vector<int>(n,-1));
        // for(auto i: dp)for(auto j: i)cout<<j;
        return help(0,0,m,n,dp);
    }
    int help(int i,int j,int m,int n,vector<vector<int>>& dp){
        if(i<0||j<0||i>=m||j>=n)return 0;
        if(i==m-1&&j==n-1)return 1;
        if(dp[i][j]!=-1){
            // cout<<"here";
            return dp[i][j];
        }
        int op1=help(i+1,j,m,n,dp);
        int op2=help(i,j+1,m,n,dp);
        dp[i][j]=op1+op2;
        return dp[i][j];
    }
};