class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        def dfs(board,i,j):
            if i<0 or i>=len(board) or j<0 or j>=len(board[0]): return
            if board[i][j]=='X' or board[i][j] == 'o': return
            board[i][j]='o'
            if (i+1<len(board)): dfs(board,i+1,j)
            if (j+1<len(board[0])): dfs(board,i,j+1)
            if (i-1>=0): dfs(board,i-1,j)
            if (j-1>=0): dfs(board,i,j-1)
        for i in range(len(board)):
            if board[i][0] == 'O':
                dfs(board,i,0)
            if board[i][len(board[0])-1] == 'O':
                dfs(board,i,len(board[0])-1)
        for j in range(len(board[0])):
            if board[0][j] == 'O':
                dfs(board,0,j)
            if board[len(board)-1][j] == 'O':
                dfs(board,len(board)-1,j)
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == 'o':
                    board[i][j] = 'O'
                else: board[i][j] = 'X'



        