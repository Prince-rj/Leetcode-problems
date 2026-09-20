class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        if len(word1)==0: return len(word2)
        if len(word2)==0: return len(word1)
        dp=[[-1]*len(word2) for _ in range(len(word1))]
        def help(i,j):
            # print(dp)
            if i==len(word1):
                return len(word2)-j
            if j==len(word2):
                return len(word1)-i
            if dp[i][j]!=-1: return dp[i][j]
            if word1[i]==word2[j]: return 0+help(i+1,j+1)
            # insert
            op1=help(i,j+1)
            # delete
            op2=help(i+1,j)
            # replace
            op3=help(i+1,j+1)
            dp[i][j]= 1+min(op1,min(op2,op3))
            return dp[i][j]
        val=help(0,0)
        return val