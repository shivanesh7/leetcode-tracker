// Last updated: 7/9/2026, 9:51:40 AM
class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            if(sum > max) {
                max = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}