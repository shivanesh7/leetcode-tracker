// Last updated: 7/9/2026, 9:47:38 AM
class Solution {
    public String shortestSuperstring(String[] A) {
        int n = A.length;

        int[][] overlap = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    overlap[i][j] = calc(A[i], A[j]);
                }
            }
        }

        int N = 1 << n;
        int[][] dp = new int[N][n];
        int[][] parent = new int[N][n];

        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
            Arrays.fill(parent[i], -1);
        }

        for (int i = 0; i < n; i++) {
            dp[1 << i][i] = 0;
        }

        for (int mask = 0; mask < N; mask++) {
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == 0 || dp[mask][i] == -1) continue;

                for (int j = 0; j < n; j++) {
                    if ((mask & (1 << j)) != 0) continue;

                    int nextMask = mask | (1 << j);
                    int val = dp[mask][i] + overlap[i][j];

                    if (val > dp[nextMask][j]) {
                        dp[nextMask][j] = val;
                        parent[nextMask][j] = i;
                    }
                }
            }
        }

        int last = 0;
        int full = N - 1;

        for (int i = 1; i < n; i++) {
            if (dp[full][i] > dp[full][last]) {
                last = i;
            }
        }

        List<Integer> path = new ArrayList<>();
        int mask = full;

        while (last != -1) {
            path.add(last);
            int p = parent[mask][last];
            mask ^= (1 << last);
            last = p;
        }

        Collections.reverse(path);

        StringBuilder sb = new StringBuilder(A[path.get(0)]);

        for (int i = 1; i < path.size(); i++) {
            int prev = path.get(i - 1);
            int curr = path.get(i);
            sb.append(A[curr].substring(overlap[prev][curr]));
        }

        return sb.toString();
    }

    private int calc(String a, String b) {
        int max = Math.min(a.length(), b.length());

        for (int k = max; k > 0; k--) {
            if (a.endsWith(b.substring(0, k))) return k;
        }

        return 0;
    }
}