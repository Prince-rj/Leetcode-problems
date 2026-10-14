class Solution:
    def countDigitOccurrences(self, nums: list[int], digit: int) -> int:
        cnt=0
        for i in nums:
            t=i
            while t>0:
                v=t%10
                t=t//10
                if v==digit:
                    cnt+=1
        return cnt
