class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        dp=[[None]*len(grid[0]) for _ in range(len(grid))]
        def help(i,j):
            if i==len(grid)-1 and j==len(grid[0])-1: return grid[i][j]
            if i>=len(grid) or j>=len(grid[0]): return 1e9
            if dp[i][j] is not None: return dp[i][j]
            #down
            op1=grid[i][j]+help(i+1,j)
            #right
            op2=grid[i][j]+help(i,j+1)
            dp[i][j]= min(op1,op2)
            return dp[i][j]
        return help(0,0)
        
