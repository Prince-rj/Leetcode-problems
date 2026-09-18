class Solution:
    def searchRange(self, nums: list[int], target: int) -> list[int]:
        ans=[-1,-1]
        i=0;j=len(nums)-1
        while i<=j:
            mid=i+(j-i)//2
            if nums[mid]>=target:
                if nums[mid]==target: ans[0]=mid
                j=mid-1
            else: i=mid+1
        i=0;j=len(nums)-1
        while i<=j:
            mid=i+(j-i)//2
            if nums[mid]<=target:
                if nums[mid]==target: ans[1]=mid
                i=mid+1
            else: j=mid-1
        return ans
