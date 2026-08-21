class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxSum = nums[0];
        int minSum = nums[0];

        int maxBest = nums[0];
        int minBest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            maxBest = Math.max(nums[i], maxBest + nums[i]);

            minBest = Math.min(nums[i], minBest + nums[i]);

            maxSum = Math.max(maxSum, maxBest);

            minSum = Math.min(minSum, minBest);
        }

        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}