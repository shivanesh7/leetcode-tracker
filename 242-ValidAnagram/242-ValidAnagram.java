// Last updated: 7/9/2026, 9:50:13 AM
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] m = s.toCharArray();
        char[] n = t.toCharArray();

        Arrays.sort(m);
        Arrays.sort(n);

        return Arrays.equals(m, n);
    }
}
