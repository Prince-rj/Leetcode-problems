class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def dfs(grid,i,j):
            if i<0 or j<0 or i>= len(grid) or j >= len(grid[0]): return
            if grid[i][j]=='0': return
            grid[i][j]='0'
            if i+1<len(grid): dfs(grid,i+1,j)
            if j+1<len(grid[0]): dfs(grid,i,j+1)
            if i-1>=0: dfs(grid,i-1,j)
            if j-1>=0: dfs(grid,i,j-1)
        ans=0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j]=='1':
                    dfs(grid,i,j)
                    ans+=1
        return ans