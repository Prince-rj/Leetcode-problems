class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        lis=[]
        def swap(i,j,nums):
            t=nums[i]
            nums[i]=nums[j]
            nums[j]=t
        def help(i):
            if i==len(nums):
                l=[]
                for a in nums: l.append(a)
                lis.append(l)
                return
            for x in range(i,len(nums)):
                swap(x,i,nums)
                help(i+1)
                swap(x,i,nums)
        help(0)
        return lis

            