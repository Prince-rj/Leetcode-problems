class Solution:
    def climbStairs(self, n: int) -> int:
        dp=[-1]*(n+1)
        def help(n):
            if n==0: return 1
            if n<0: return 0
            if dp[n]!=-1: return dp[n]
            op1=help(n-1)
            op2=help(n-2)
            dp[n]=op1+op2
            return dp[n]
        return help(n)
        