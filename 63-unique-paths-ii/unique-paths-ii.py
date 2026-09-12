class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        dp = [[None]*len(obstacleGrid[0]) for _ in range(len(obstacleGrid))]
        if obstacleGrid[len(obstacleGrid)-1][len(obstacleGrid[0])-1] ==1: return 0
        def help(i,j):
            if i==len(obstacleGrid)-1 and j==len(obstacleGrid[0])-1: return 1
            if i>=len(obstacleGrid) or j>=len(obstacleGrid[0]): return 0
            if obstacleGrid[i][j]==1: return 0
            if dp[i][j] is not None : return dp[i][j]
            # op1 go left
            op1 = help(i+1,j)
            # op2 go right
            op2 = help(i,j+1)
            dp[i][j]= op1+op2
            return dp[i][j]
        return help(0,0)