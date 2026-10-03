class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        mini=min(nums)
        maxi=max(nums)
        s=set()
        for i in nums:
            s.add(i)
        ans=[]
        for i in range(mini+1, maxi):
            if i not in s:
                ans.append(i)
        return ans
        
