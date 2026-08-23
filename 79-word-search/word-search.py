class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        # def help(i,j,s):
        #     # print("".join(s),i,j,path)
        #     if "".join(s)==word: return True
        #     if len(s)>=len(word) or i>=len(board) or j>=len(board[0]) or i<0 or j<0:
        #         return False
        #     val=False
        #     s.append(board[i][j])
        #     if "".join(s)==word: return True
        #     v=board[i][j]
        #     board[i][j]='#'
        #     if i+1<len(board) and board[i+1][j]!='#':
        #         # path.add((i+1,j))
        #         val= val or help(i+1,j,s)
        #         # path.remove((i+1,j))
        #         # s.pop()
        #         # val=val or help(i+1,j,s)
        #     if j+1<len(board[0]) and board[i][j+1]!='#':
        #         # s.append(board[i][j])
        #         # path.add((i,j+1))
        #         val= val or help(i,j+1,s)
        #         # path.remove((i,j+1))
        #         # s.pop()
        #         # val=val or help(i,j+1,s)
        #     if i-1>=0 and board[i-1][j]!='#' :
        #         # s.append(board[i][j])
        #         # path.add((i-1,j))
        #         val=val or help(i-1,j,s)
        #         # path.remove((i-1,j))
        #         # s.pop()
        #         # val=val or help(i-1,j,s)
        #     if j-1>=0 and board[i][j-1]!='#':
        #         # s.append(board[i][j])
        #         # path.add((i,j-1))
        #         val= val or help(i,j-1,s)
        #         # path.remove((i,j-1))
        #         # val=val or help(i,j-1,s)
        #     s.pop()
        #     # print(s)
        #     board[i][j]=v
        #     return val
        # # path=set()
        # for i in range(len(board)):
        #     for j in range(len(board[0])):
        #         val= help(i,j,[])
        #         if val: return True
        # return False
#
        m = len(board)
        n = len(board[0])

        # Character frequency pruning
        board_count = Counter(c for row in board for c in row)
        word_count = Counter(word)

        for c in word_count:
            if word_count[c] > board_count[c]:
                return False

        # Start from the rarer character
        if board_count[word[0]] > board_count[word[-1]]:
            word = word[::-1]

        def dfs(i, j, idx):

            if idx == len(word):
                return True

            if (i < 0 or i >= m or
                j < 0 or j >= n or
                board[i][j] != word[idx]):
                return False

            temp = board[i][j]
            board[i][j] = '#'

            found = (
                dfs(i + 1, j, idx + 1) or
                dfs(i - 1, j, idx + 1) or
                dfs(i, j + 1, idx + 1) or
                dfs(i, j - 1, idx + 1)
            )

            board[i][j] = temp

            return found

        for i in range(m):
            for j in range(n):
                if dfs(i, j, 0):
                    return True

        return False

