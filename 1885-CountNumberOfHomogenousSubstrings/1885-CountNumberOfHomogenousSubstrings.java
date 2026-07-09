// Last updated: 7/9/2026, 9:46:06 AM
class Solution {
    public int countHomogenous(String s) {
        int MOD = 1_000_000_007;

        long res = 0;
        int count = 0;
        char prev = 0;

        for (char c : s.toCharArray()) {
            if (c == prev) {
                count++;
            } else {
                count = 1;
                prev = c;
            }

            res = (res + count) % MOD;
        }

        return (int) res;
    }
}