import heapq
import collections
from typing import List

class Solution:
    def minOperations(self, nums: List[int], x: int, k: int) -> int:
        n = len(nums)
        
        # ---------------------------------------------------------------------
        # STEP 1: PRECOMPUTE WINDOW COSTS VIA TWO-HEAPS (Sliding Window)
        # ---------------------------------------------------------------------
        costs = [0] * (n - x + 1)
        max_heap, min_heap = [], []
        max_heap_size, min_heap_size = 0, 0
        left_sum, right_sum = 0, 0
        deleted = collections.defaultdict(int)
        
        def prune_heaps():
            nonlocal max_heap_size, min_heap_size
            while max_heap and deleted[-max_heap[0]] > 0:
                val = -heapq.heappop(max_heap)
                deleted[val] -= 1
            while min_heap and deleted[min_heap[0]] > 0:
                val = heapq.heappop(min_heap)
                deleted[val] -= 1
                
        def balance():
            nonlocal max_heap_size, min_heap_size, left_sum, right_sum
            while max_heap_size > min_heap_size + 1:
                val = -heapq.heappop(max_heap)
                left_sum -= val
                max_heap_size -= 1
                heapq.heappush(min_heap, val)
                right_sum += val
                min_heap_size += 1
                prune_heaps()
            while max_heap_size < min_heap_size:
                val = heapq.heappop(min_heap)
                right_sum -= val
                min_heap_size -= 1
                heapq.heappush(max_heap, -val)
                left_sum += val
                max_heap_size += 1
                prune_heaps()

        def add_num(val):
            nonlocal max_heap_size, min_heap_size, left_sum, right_sum
            if not max_heap or val <= -max_heap[0]:
                heapq.heappush(max_heap, -val)
                left_sum += val
                max_heap_size += 1
            else:
                heapq.heappush(min_heap, val)
                right_sum += val
                min_heap_size += 1
            prune_heaps()
            balance()

        def remove_num(val):
            nonlocal max_heap_size, min_heap_size, left_sum, right_sum
            deleted[val] += 1
            if val <= -max_heap[0]:
                left_sum -= val
                max_heap_size -= 1
            else:
                right_sum -= val
                min_heap_size -= 1
            prune_heaps()
            balance()

        # Build initial window
        for idx in range(x):
            add_num(nums[idx])
        median = -max_heap[0]
        costs[0] = (right_sum - min_heap_size * median) + (max_heap_size * median - left_sum)

        # Slide across the array
        for j in range(x, n):
            remove_num(nums[j - x])
            add_num(nums[j])
            median = -max_heap[0]
            costs[j - x + 1] = (right_sum - min_heap_size * median) + (max_heap_size * median - left_sum)

        # ---------------------------------------------------------------------
        # STEP 2: ITERATIVE TABULATION WITH O(N) SPACE OPTIMIZATION
        # ---------------------------------------------------------------------
        # Instead of storing an full matrix of size (N * K), we maintain 2 arrays:
        # 'prev_dp' tracks the cost for (j-1) subarrays.
        # 'curr_dp' calculates the costs for the current layer of 'j' subarrays.
        INF = float('inf')
        prev_dp = [0] * (n + 1)
        
        # Outer loop builds up from needing 1 subarray to needing k subarrays
        for j in range(1, k + 1):
            curr_dp = [INF] * (n + 1)
            
            # Inner loop sweeps backwards across the array elements
            for i in range(n - 1, -1, -1):
                # Option 1: Skip the current index
                op1 = curr_dp[i + 1]
                
                # Option 2: Place a subarray chunk of size x right here
                op2 = INF
                if i + x <= n and prev_dp[i + x] != INF:
                    op2 = costs[i] + prev_dp[i + x]
                
                curr_dp[i] = min(op1, op2)
                
            # Transition to the next loop layer
            prev_dp = curr_dp

        return prev_dp[0] if prev_dp[0] != INF else -1
