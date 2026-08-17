class Solution:
    def snakesAndLadders(self, board: List[List[int]]) -> int:
        q=deque()
        q.append([len(board)**2-1,0])
        vis=set()
        while q:
            tmp=q.popleft()
            # print(len(board)%2==1 ,tmp[0])
            if tmp[0]==0: return tmp[1]
            # flag=False
            # elif len(board)%2==1 and tmp[0]==len(board[1])-1: return tmp[1]
            for i in range(6):
                val=tmp[0]-i-1
                # val=len(board)**2 - val - 1
                if val<0: continue
                boardval=val
                a=val//len(board[0]); b=val%len(board[0])
                if len(board)%2==0 and a%2!=0: b=len(board[0])-b-1
                elif len(board)%2==1 and a%2==0: b=len(board[0])-b-1
                if board[a][b]!=-1: boardval=len(board)**2-board[a][b]
                # if boardval < tmp[0]: flag=True
                # print(a,b,boardval)
                if boardval not in vis:
                    q.append([boardval,tmp[1]+1])
                vis.add(boardval)
            # if not flag: return -1
        return -1
            
        