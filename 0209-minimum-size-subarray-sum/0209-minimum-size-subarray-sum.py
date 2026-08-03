class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        result = float('inf')
        current_sum = 0
        low = 0

        for high in range(len(nums)):
            current_sum += nums[high]

            while current_sum >= target:
                length = high - low + 1
                result = min(result, length)
                current_sum -= nums[low]
                low += 1

        return 0 if result == float('inf') else result