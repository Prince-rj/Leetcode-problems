class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        N=n*2
        lis=[]
        def help(i,v,l):
            print(i,v,l)
            if i==N and v==0:
                s="".join(l)
                lis.append(s)
                return
            if v<0 or i>=N: return
            l.append('(')
            help(i+1,v+1,l)
            l.pop()
            l.append(')')
            help(i+1,v-1,l)
            l.pop()
        help(0,0,[])
        return lis
        