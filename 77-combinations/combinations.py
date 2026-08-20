class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        def help(n,x,k,lis,l):
            if len(l)==k:
                a=list()
                for i in l: a.append(i)
                lis.append(a)
                return
            for i in range(x,n+1):
                l.append(i)
                help(n,i+1,k,lis,l)
                l.pop()
        lis=list()
        l=list()
        help(n,1,k,lis,l)
        return lis
            
        