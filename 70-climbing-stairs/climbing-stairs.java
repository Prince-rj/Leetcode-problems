class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return help(0,n,dp);
    }
    public int help(int i,int n,int[] dp){
        if(i==n) return 1;
        else if(i>n)return 0;
        if(dp[i]!=-1)return dp[i];
        int op1=0;
        int op2=0;
        //1 step
        op1=help(i+1,n,dp);
        //2 step
        op2=help(i+2,n,dp);
        return dp[i]=op1+op2;
    }
}