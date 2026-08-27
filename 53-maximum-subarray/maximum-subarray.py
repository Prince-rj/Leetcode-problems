class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxi=nums[0]
        summ=0
        for i in nums:
            if summ<0: summ=0
            summ+=i
            maxi=max(maxi,summ)
        return maxi
        