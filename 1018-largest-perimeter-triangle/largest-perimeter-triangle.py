class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        def isTriangle(a,b,c):
            if a+b>c and a+c>b and b+c>a: return True
            return False
        nums.sort()
        for i in range(len(nums)-3,-1,-1):
            if isTriangle(nums[i],nums[i+1],nums[i+2]):
                return nums[i]+nums[i+1]+nums[i+2]
        return 0


