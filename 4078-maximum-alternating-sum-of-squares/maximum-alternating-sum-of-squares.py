class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        nums=[ i*i for i in nums]
        nums.sort()
        s=0
        for i in range((len(nums)//2)):
            s-=(nums[i])
        for i in range((len(nums)//2),len(nums)):
            s+=(nums[i])
        return s

            