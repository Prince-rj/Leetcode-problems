class Solution:
    def mirrorDistance(self, n: int) -> int:
        t=n
        a=0
        while n>0:
            a=a*10+n%10
            n=n//10
        return abs(t-a)