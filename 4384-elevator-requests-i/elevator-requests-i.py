class Solution:
    def elevatorRequests(self, n: int, requests: list[int]) -> int:
        val=0
        prev=0
        for i in requests:
            val+=abs(i-prev)
            prev=i
        return val
