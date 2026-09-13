class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        h=[]
        # heappush
        for i in nums:
            heapq.heappush(h,i)
        k=len(nums)-k
        while k>0:
            k-=1
            heapq.heappop(h)
        return heapq.heappop(h)