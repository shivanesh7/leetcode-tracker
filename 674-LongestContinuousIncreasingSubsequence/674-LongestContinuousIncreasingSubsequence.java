// Last updated: 7/9/2026, 9:48:15 AM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            res = Math.max(res, count);
        }

        return res;
    }
}