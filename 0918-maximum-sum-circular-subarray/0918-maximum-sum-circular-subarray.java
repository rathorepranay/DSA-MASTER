class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int bestMax = nums[0], bestMin = nums[0], maxSum = nums[0], minSum = nums[0], total = 0;
       for(int i = 0; i < nums.length; i++){
        total += nums[i];
        if(i>0){
            bestMax = Math.max(nums[i], bestMax+nums[i]);
            bestMin = Math.min(nums[i], bestMin+nums[i]);
            maxSum = Math.max(maxSum, bestMax);
            minSum = Math.min(minSum, bestMin);
        }
       }
       if(maxSum<0){
        return maxSum;
       }
       return Math.max(maxSum, total-minSum);
    }
}