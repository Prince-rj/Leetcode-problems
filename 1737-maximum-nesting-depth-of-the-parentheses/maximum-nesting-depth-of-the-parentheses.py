class Solution:
    def maxDepth(self, s: str) -> int:
        cnt=0
        x=0
        for i in s:
            if i=='(': cnt+=1
            if i==')': cnt-=1
            x=max(x,cnt)
        return x