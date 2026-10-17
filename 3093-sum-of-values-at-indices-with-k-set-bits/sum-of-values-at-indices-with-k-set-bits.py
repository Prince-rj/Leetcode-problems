class Solution:
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        def setbits(n):
            s=0
            for i in range(32):
                val=n>>i&1
                s+=val
            return s
        su=0
        for i in range(len(nums)):
            if setbits(i)==k:
                su+=nums[i]
        return su

        