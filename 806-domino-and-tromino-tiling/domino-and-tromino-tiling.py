class Solution:
    def numTilings(self, n: int) -> int:
        mod=int(1e9)+7
        def help(i,pos,n,dp):
            if i>n or (i==n and pos): return 0
            if(i==n and not pos): return 1
            if dp[i][pos] is not None: return dp[i][pos]
            op1=0;op2=0;op3=0;op4=0;op5=0
            if pos:
                op1=help(i+1,False,n,dp)
                op2=help(i+1,True,n,dp)
                dp[i][pos]=(op1+op2+op3+op4+op5)%mod
                return (op1+op2+op3+op4+op5)%mod
            op3=help(i+1,False,n,dp)
            op4=help(i+2,False,n,dp)
            op5=2*help(i+2,True,n,dp)
            dp[i][pos]=(op1+op2+op3+op4+op5)%mod
            return (op1+op2+op3+op4+op5)%mod
        dp=[[None]*2 for _ in range(n+1)]
        return help(0,False,n,dp)