class Solution:
    def maxCoins(self, piles: list[int]) -> int:
        piles.sort()
        i=len(piles)-2
        j=len(piles)//3
        s=0
        print(piles)
        while i>=j: 
            # j-=3
            # k-=3
            s+=piles[i]
            i-=2
            # j+=1
            # if j>=0: s2+=piles[j]
            # if k>=0: s3+=piles[k]
            
        return s