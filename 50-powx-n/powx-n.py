class Solution:
    def myPow(self, x: float, n: int) -> float:
        def help(x,n):
            if n==0:
                return 1
            if n==1:
                return x
            v=help(x,n//2)
            if n%2==0:
                return v*v
            else:
                return x*v*v
        if n<0: return 1/help(x,-1*n)
        return help(x,n)
