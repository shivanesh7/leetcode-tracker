// Last updated: 7/9/2026, 9:46:46 AM
class Solution {
    public int minFlips(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int start = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    start |= (1 << (i * n + j));
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.offer(start);
        visited.add(start);

        int[][] dirs = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};

        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int mask = q.poll();

                if (mask == 0) return steps;

                for (int r = 0; r < m; r++) {
                    for (int c = 0; c < n; c++) {

                        int next = mask;
                        int[][] flip = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};

                        int x = r, y = c;

                        next ^= (1 << (x * n + y));

                        if (x + 1 < m) next ^= (1 << ((x + 1) * n + y));
                        if (x - 1 >= 0) next ^= (1 << ((x - 1) * n + y));
                        if (y + 1 < n) next ^= (1 << (x * n + y + 1));
                        if (y - 1 >= 0) next ^= (1 << (x * n + y - 1));

                        if (!visited.contains(next)) {
                            visited.add(next);
                            q.offer(next);
                        }
                    }
                }
            }

            steps++;
        }

        return -1;
    }
}