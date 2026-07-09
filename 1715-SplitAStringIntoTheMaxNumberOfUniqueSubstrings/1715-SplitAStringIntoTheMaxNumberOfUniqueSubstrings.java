// Last updated: 7/9/2026, 9:46:16 AM
class Solution {
    public int maxUniqueSplit(String s) {
        return backtrack(s, 0, new HashSet<>());
    }

    private int backtrack(String s, int start, Set<String> set) {
        if (start == s.length()) return 0;

        int max = -1;

        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);

            if (set.contains(sub)) continue;

            set.add(sub);
            int next = backtrack(s, end, set);

            if (next != -1) {
                max = Math.max(max, 1 + next);
            }

            set.remove(sub);
        }

        return max;
    }
}