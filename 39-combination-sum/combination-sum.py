class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        lis=[]
        def help(i,l,s):
            if s>target or i>=len(nums): return
            if s==target:
                a=[]
                for x in l: a.append(x)
                lis.append(a)
                return

            # for x in range(i,len(nums)):
            l.append(nums[i])
            help(i,l,s+nums[i])
            l.pop()
            help(i+1,l,s)
        nums=sorted(nums)
        help(0,[],0)
        return lis
        