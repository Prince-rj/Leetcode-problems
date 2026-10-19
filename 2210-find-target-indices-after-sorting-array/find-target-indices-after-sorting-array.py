class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        ind=0
        cnt=0
        for i in nums:
            if i<target:
                ind+=1
            if i==target: cnt+=1
        ans=[]
        for i in range(cnt):
            ans.append(ind)
            ind+=1
        return ans
        