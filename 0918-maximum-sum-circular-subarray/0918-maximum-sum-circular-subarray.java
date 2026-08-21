class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
        int curr = 0;

        for (int num : nums) {
            curr = num+Math.max(curr,0);
            if (curr > max) {
                max = curr;
            }
        }
        int c=0;
        for (int num : nums) {
            c = num+Math.min(c,0);
            if (c < min) {
                min = c;
            }
        }
        int total=0;
        for(int i:nums){
            total+=i;
        }
        if(total==min) return max;
        return Math.max(max,total-min);
    }
}