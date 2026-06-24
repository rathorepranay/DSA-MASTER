class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sum = 0
        n = len(nums)
        expsum = int((n*(n+1))/2)
        for n in nums:
            sum += n
        return expsum-sum