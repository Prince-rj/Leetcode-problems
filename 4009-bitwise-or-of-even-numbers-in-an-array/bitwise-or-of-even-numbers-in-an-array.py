class Solution:
    def evenNumberBitwiseORs(self, nums: List[int]) -> int:
        val=0
        # cnt=0
        for i in nums:
            if i%2==0:
                # cnt+=1
                val=val | i
        # if cnt==0: return 0
        return val