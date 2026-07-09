// Last updated: 7/9/2026, 9:46:49 AM
class Solution {
    public int palindromePartition(String s, int k) {
        int n = s.length();

        int[][] cost = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                cost[i][j] = getCost(s, i, j);
            }
        }

        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        }

        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int parts = 1; parts <= k; parts++) {
                for (int j = 0; j < i; j++) {
                    dp[i][parts] = Math.min(dp[i][parts],
                            dp[j][parts - 1] + cost[j][i - 1]);
                }
            }
        }

        return dp[n][k];
    }

    private int getCost(String s, int l, int r) {
        int changes = 0;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) changes++;
            l++;
            r--;
        }
        return changes;
    }
}