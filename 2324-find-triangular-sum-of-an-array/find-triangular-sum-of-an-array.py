class Solution:
    def triangularSum(self, nums: list[int]) -> int:
        tmp=nums
        for i in range(len(nums)-1):
            t1=[]
            for j in range(len(tmp)-1):
                v=(tmp[j]+tmp[j+1])%10
                t1.append(v)
            tmp=t1
        return tmp[0]
