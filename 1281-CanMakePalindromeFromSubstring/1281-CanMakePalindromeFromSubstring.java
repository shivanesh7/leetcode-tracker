// Last updated: 7/9/2026, 9:47:03 AM
class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        int[][] prefix = new int[n + 1][26];

        for (int i = 0; i < n; i++) {
            System.arraycopy(prefix[i], 0, prefix[i + 1], 0, 26);
            prefix[i + 1][s.charAt(i) - 'a']++;
        }

        List<Boolean> res = new ArrayList<>();

        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2];

            int odd = 0;

            for (int i = 0; i < 26; i++) {
                int cnt = prefix[r + 1][i] - prefix[l][i];
                if (cnt % 2 != 0) odd++;
            }

            res.add(odd / 2 <= k);
        }

        return res;
    }
}