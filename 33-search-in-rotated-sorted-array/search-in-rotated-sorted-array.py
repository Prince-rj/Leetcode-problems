class Solution:
    def search(self, nums: list[int], target: int) -> int:
        i=0;j=len(nums)-1
        pivot=0
        l=len(nums)-1
        while i<=j:
            mid=i+(j-i)//2
            if nums[mid]<=nums[l]:
                j=mid-1
                pivot=mid
            else: i=mid+1
        i=0;j=len(nums)-1
        while(i<=j):
            mid=i+(j-i)//2
            ind= (mid+pivot)%len(nums)
            if nums[ind]==target:
                return ind
            elif nums[ind]>target: j=mid-1
            else: i=mid+1
        return -1
                



