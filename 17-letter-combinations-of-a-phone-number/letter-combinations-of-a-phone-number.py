class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        dc=dict()
        dc['2']=['a','b','c']
        dc['3']=['d','e','f']
        dc['4']=['g','h','i']
        dc['5']=['j','k','l']
        dc['6']=['m','n','o']
        dc['7']=['p','q','r','s']
        dc['8']=['t','u','v']
        dc['9']=['w','x','y','z']
        def help(dc,digits,i,lis,s):
            if i== len(digits):
                v="".join(s)
                lis.append(v)
                return
            for x in dc[digits[i]]:
                s.append(x)
                help(dc,digits,i+1,lis,s)
                s.pop()
        lis=list()
        s=list()
        help(dc,digits,0,lis,s)
        return lis