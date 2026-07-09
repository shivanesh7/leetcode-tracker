// Last updated: 7/9/2026, 9:46:11 AM
class Solution {
    public String getSmallestString(int n, int k) {
        char[] res = new char[n];
        Arrays.fill(res, 'a');

        k -= n;

        for (int i = n - 1; i >= 0; i--) {
            int add = Math.min(25, k);
            res[i] = (char) (res[i] + add);
            k -= add;
        }

        return new String(res);
    }
}