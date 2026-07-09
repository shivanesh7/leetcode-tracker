// Last updated: 7/9/2026, 9:46:39 AM
class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], x -> new ArrayList<>()).add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(0);
        visited[0] = true;

        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int idx = q.poll();

                if (idx == n - 1) return steps;

                // move left/right
                if (idx - 1 >= 0 && !visited[idx - 1]) {
                    visited[idx - 1] = true;
                    q.offer(idx - 1);
                }
                if (idx + 1 < n && !visited[idx + 1]) {
                    visited[idx + 1] = true;
                    q.offer(idx + 1);
                }

                // same value jumps
                if (map.containsKey(arr[idx])) {
                    for (int j : map.get(arr[idx])) {
                        if (!visited[j]) {
                            visited[j] = true;
                            q.offer(j);
                        }
                    }
                    map.remove(arr[idx]); // important optimization
                }
            }

            steps++;
        }

        return -1;
    }
}