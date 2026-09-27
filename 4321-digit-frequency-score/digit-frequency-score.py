class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        dic={}
        while n>0:
            v=n%10
            n=n//10
            if v in dic: dic[v]+=1
            else: dic[v]=1
        ans=0
        for k,v in dic.items():
            ans+=k*v
        return ans
