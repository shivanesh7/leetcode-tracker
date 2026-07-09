// Last updated: 7/9/2026, 9:48:09 AM
class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if (dead.contains("0000")) return -1;

        Queue<String> q = new LinkedList<>();
        q.offer("0000");

        Set<String> visited = new HashSet<>();
        visited.add("0000");

        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String curr = q.poll();

                if (curr.equals(target)) return steps;

                if (dead.contains(curr)) continue;

                for (String next : getNext(curr)) {
                    if (!visited.contains(next)) {
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }
            steps++;
        }

        return -1;
    }

    private List<String> getNext(String s) {
        List<String> res = new ArrayList<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < 4; i++) {
            char c = arr[i];

            arr[i] = c == '9' ? '0' : (char)(c + 1);
            res.add(new String(arr));

            arr[i] = c == '0' ? '9' : (char)(c - 1);
            res.add(new String(arr));

            arr[i] = c;
        }

        return res;
    }
}