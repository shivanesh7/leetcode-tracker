// Last updated: 7/9/2026, 9:47:50 AM
class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                size *= (c - '0');
            } else {
                size++;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            k %= size;

            if (k == 0 && Character.isLetter(c)) {
                return String.valueOf(c);
            }

            if (Character.isDigit(c)) {
                size /= (c - '0');
            } else {
                size--;
            }
        }

        return "";
    }
}