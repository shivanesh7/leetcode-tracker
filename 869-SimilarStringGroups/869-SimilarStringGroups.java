// Last updated: 7/9/2026, 9:47:56 AM
class Solution {
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        boolean[] visited = new boolean[n];
        int groups = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(strs, visited, i);
                groups++;
            }
        }

        return groups;
    }

    private void dfs(String[] strs, boolean[] visited, int idx) {
        visited[idx] = true;

        for (int i = 0; i < strs.length; i++) {
            if (!visited[i] && isSimilar(strs[idx], strs[i])) {
                dfs(strs, visited, i);
            }
        }
    }

    private boolean isSimilar(String a, String b) {
        int diff = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
                if (diff > 2) return false;
            }
        }

        return diff == 0 || diff == 2;
    }
}