class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        if len(nums)==1: return 0
        nums.sort()
        tomake=min(nums)
        if len(nums)%2==0: tomake=(nums[len(nums)//2]+nums[(len(nums)//2)-1])//2
        else: tomake=nums[len(nums)//2]

        s=0
        for i in nums:
            s+=abs(tomake-i)
        return s
