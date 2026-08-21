class Solution {
    public int maxSubArray(int[] nums) {
        int bestSum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            int choice1 = nums[i]+bestSum;
            int choice2 = nums[i];
            bestSum = Math.max(choice1, choice2);
            ans = Math.max(ans,bestSum);
        }
        return ans;
    }
}