class Solution:
    def uniquePaths(self, grid: List[List[int]]) -> int:
        dp=[[[None]*2 for _ in range(len(grid[0]))] for _ in range(len(grid))]
        def help(i,j,d):
            if i==len(grid)-1 and j==len(grid[0])-1: return 1
            if i==len(grid) or j==len(grid[0]): return 0
            if dp[i][j][d]!=None: return dp[i][j][d]
            a=0;b=0
            # print(i,j)
            if grid[i][j]==0:
                a=help(i+1,j,1)%(10**9+7)
                b=help(i,j+1,0)%(10**9+7)
                dp[i][j][d]=a+b
                return a+b
            elif d==0: 
                if i+1<len(grid):
                    a=help(i+1,j,1)%(10**9+7)
                # print(i,j,a)
                dp[i][j][d]=a
                return a
            else:
                if j+1<len(grid[0]):
                    a=help(i,j+1,0)%(10**9+7)
                dp[i][j][d]=a
                return a
        return help(0,0,0)%(10**9+7)

