class Solution:
    def maximum69Number (self, num: int) -> int:
        def rever(t):
            rev=0
            while t>0:
                v=t%10
                t=t//10
                rev=rev*10+v
            return rev
        rev=rever(num)
        print(rev)
        val=0
        fir=0
        while rev>0:
            v=rev%10
            rev=rev//10
            if fir==0 and v==6:
                v=9
                fir=1
            val=val*10+v
        # print(val)
        return val


