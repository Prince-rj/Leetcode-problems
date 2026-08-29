class Solution:
    def maxSubarraySumCircular(self, nums: List[int]) -> int:
        # 1 -2 3 -2 1 -2 3 -2
        # 1 2 3 4 5 1 2 3 4 5
        mini=nums[0];minsum=0;total=0;maxsum=0;maxi=nums[0]
        for a in nums:
            maxsum=max(maxsum+a,a)
            maxi=max(maxi,maxsum)
            minsum=min(minsum+a,a)
            mini=min(minsum,mini)
            total+=a
            # print(maxsum,maxi,minsum,mini,total)

        return max(maxi,total-mini) if maxi>0 else maxi
            