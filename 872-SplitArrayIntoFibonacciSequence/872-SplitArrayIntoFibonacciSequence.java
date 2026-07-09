// Last updated: 7/9/2026, 9:47:53 AM
class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> res = new ArrayList<>();
        if (backtrack(num, res, 0)) return res;
        return new ArrayList<>();
    }

    private boolean backtrack(String s, List<Integer> res, int idx) {
        if (idx == s.length()) return res.size() >= 3;

        long val = 0;

        for (int i = idx; i < s.length(); i++) {
            if (i > idx && s.charAt(idx) == '0') break;

            val = val * 10 + (s.charAt(i) - '0');

            if (val > Integer.MAX_VALUE) break;

            int size = res.size();

            if (size >= 2) {
                long sum = (long) res.get(size - 1) + res.get(size - 2);
                if (val < sum) continue;
                if (val > sum) break;
            }

            res.add((int) val);

            if (backtrack(s, res, i + 1)) return true;

            res.remove(res.size() - 1);
        }

        return false;
    }
}