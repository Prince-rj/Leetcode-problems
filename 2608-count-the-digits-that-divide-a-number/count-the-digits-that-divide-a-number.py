class Solution:
    def countDigits(self, num: int) -> int:
        t=num
        cnt=0
        while t>0:
            v=t%10
            t=t//10
            if num%v==0:
                cnt+=1
        return cnt
            
        