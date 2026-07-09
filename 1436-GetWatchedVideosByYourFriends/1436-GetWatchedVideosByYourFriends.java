// Last updated: 7/9/2026, 9:46:42 AM
class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos,
                                               int[][] friends,
                                               int id,
                                               int level) {

        int n = friends.length;
        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        q.offer(id);
        visited[id] = true;

        int currLevel = 0;

        while (!q.isEmpty() && currLevel < level) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int node = q.poll();

                for (int f : friends[node]) {
                    if (!visited[f]) {
                        visited[f] = true;
                        q.offer(f);
                    }
                }
            }
            currLevel++;
        }

        Map<String, Integer> freq = new HashMap<>();

        while (!q.isEmpty()) {
            int person = q.poll();
            for (String video : watchedVideos.get(person)) {
                freq.put(video, freq.getOrDefault(video, 0) + 1);
            }
        }

        List<String> res = new ArrayList<>(freq.keySet());

        res.sort((a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(a) - freq.get(b);
            }
            return a.compareTo(b);
        });

        return res;
    }
}