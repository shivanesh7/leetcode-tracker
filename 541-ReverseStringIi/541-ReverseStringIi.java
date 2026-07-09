// Last updated: 7/9/2026, 9:48:29 AM
class Solution {
    public String reverseStr(String s, int k) {
        if (s.length() <= k) {
            return new StringBuilder(s).reverse().toString();
        }
        if (s.length() <= 2 * k) {
            return new StringBuilder(s.substring(0, k)).reverse() + s.substring(k);
        }
        return new StringBuilder(s.substring(0, k)).reverse() +
               s.substring(k, 2 * k) +
               reverseStr(s.substring(2 * k), k);
    }
}
