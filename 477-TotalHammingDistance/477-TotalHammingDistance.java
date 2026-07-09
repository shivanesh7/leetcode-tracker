// Last updated: 7/9/2026, 9:48:46 AM
class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < 32; i++) {
            int ones = 0;

            for (int num : nums)
                ones += (num >> i) & 1;

            ans += ones * (n - ones);
        }

        return ans;
    }
}