class Solution:
    def climbStairs(self, n: int, costs: List[int]) -> int:
        dp=[-1]*(n+1) 
        def help(i):
            if i==n: return costs[i-1]
            if i>n: return int(1e9)
            if dp[i]!=-1: return dp[i]
            #op1 1
            op1=1+help(i+1)
            #op2 2
            op2=4+help(i+2)
            #op3 3
            op3=9+help(i+3)
            if i==0: return min(op1,min(op2,op3))
            dp[i]=costs[i-1]+min(op1,min(op2,op3))
            return dp[i]

        return help(0)
    





        # def help(i,j):
        #     if i==n: return costs[i-1]+(i-j)**2
        #     if i>n: return 1e9
        #     if j!=-1 and dp[i][j] is not None: return dp[i][j]
        #     # print(j,i,costs[i-1]+(i-j)**2)
        #     #i+1
        #     op1=help(i+1,i)
        #     #i+2
        #     op2=help(i+2,i)
        #     #i+3
        #     op3=help(i+3,i)
        #     val=0
        #     if j==-1:
        #         return min(op1,min(op2,op3))
        #     else:
        #         dp[i][j]=costs[i-1]+(i-j)**2+min(op1,min(op2,op3))
        #     return dp[i][j]
        # for i in range(n+1):
        #     dp[n][i]=costs[n-1]+(n-(i-1))**2
        # print(dp)
        # for i in range(n-1,-1,-1):
        #     for j in range(0,i+1):
        #         o1=int(1e9); o2=int(1e9); o3=int(1e9)
        #         o1=dp[i+1][i+1]
        #         if(i+2<=n): o2=dp[i+2][i+1]
        #         if(i+3<=n): o3=dp[i+3][i+1]
        #         s=costs[i-1] if i>0 else 0
        #         dp[i][j]=s+(i-(j-1))**2+min(o1,min(o2,o3))
        #         print(dp)
        # return dp[0][0]

        # return help(0,-1)
