class Solution {
    public int maxProduct(int[] nums) {
        int minEnding = 1, maxEnding  = 1, ans = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            int c1 = nums[i];
            int c2 = nums[i] * minEnding;
            int c3 = nums[i] *  maxEnding;
            maxEnding = Math.max(c1,Math.max(c2,c3));
            minEnding = Math.min(c1,Math.min(c2,c3));
            ans = Math.max(ans,Math.max(minEnding,maxEnding));
        }
        return ans;
    }
}