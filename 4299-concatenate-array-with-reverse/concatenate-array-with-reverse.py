class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        ans=[-1]*len(nums)
        
        ind=0
        for i in nums[::-1]:
            ans[ind]=i
            ind+=1
        return nums+ans
