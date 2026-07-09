// Last updated: 7/9/2026, 9:47:36 AM
class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        boolean[] visited = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, stones, visited);
                components++;
            }
        }

        return n - components;
    }

    private void dfs(int idx, int[][] stones, boolean[] visited) {
        visited[idx] = true;

        for (int i = 0; i < stones.length; i++) {
            if (!visited[i] &&
                (stones[i][0] == stones[idx][0] || stones[i][1] == stones[idx][1])) {
                dfs(i, stones, visited);
            }
        }
    }
}