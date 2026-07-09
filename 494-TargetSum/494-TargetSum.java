// Last updated: 7/9/2026, 9:48:39 AM
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) sum += num;

        if (target > sum || target < -sum) return 0;
        if ((sum + target) % 2 != 0) return 0;

        int s = (sum + target) / 2;

        int[] dp = new int[s + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = s; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[s];
    }
}