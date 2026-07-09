// Last updated: 7/9/2026, 9:47:22 AM
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] res = new int[n];

        int depth = 0;

        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                depth++;
                res[i] = depth % 2;
            } else {
                res[i] = depth % 2;
                depth--;
            }
        }

        return res;
    }
}