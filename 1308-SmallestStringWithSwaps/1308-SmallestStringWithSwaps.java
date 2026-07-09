// Last updated: 7/9/2026, 9:46:57 AM
class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        UnionFind uf = new UnionFind(n);

        for (List<Integer> p : pairs) {
            uf.union(p.get(0), p.get(1));
        }

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int root = uf.find(i);
            map.computeIfAbsent(root, x -> new ArrayList<>()).add(i);
        }

        char[] res = new char[n];

        for (List<Integer> indices : map.values()) {
            List<Character> chars = new ArrayList<>();

            for (int idx : indices) {
                chars.add(s.charAt(idx));
            }

            Collections.sort(indices);
            Collections.sort(chars);

            for (int i = 0; i < indices.size(); i++) {
                res[indices.get(i)] = chars.get(i);
            }
        }

        return new String(res);
    }

    class UnionFind {
        int[] parent;

        UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }

        void union(int a, int b) {
            parent[find(a)] = find(b);
        }
    }
}