// Last updated: 7/9/2026, 9:46:17 AM
class Solution {
    public int numWays(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();

        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        if (ones % 3 != 0) return 0;

        if (ones == 0) {
            long ways = (long)(n - 1) * (n - 2) / 2;
            return (int)(ways % MOD);
        }

        int target = ones / 3;

        int count = 0;
        long firstGap = 0, secondGap = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') count++;

            if (count == target) firstGap++;
            else if (count == 2 * target) secondGap++;
        }

        return (int)((firstGap * secondGap) % MOD);
    }
}