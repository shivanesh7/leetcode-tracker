// Last updated: 7/9/2026, 9:46:37 AM
class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int maxLen = 0;

        for (String w : words) {
            maxLen = Math.max(maxLen, w.length());
        }

        List<String> res = new ArrayList<>();

        for (int i = 0; i < maxLen; i++) {
            StringBuilder sb = new StringBuilder();

            for (String w : words) {
                if (i < w.length()) {
                    sb.append(w.charAt(i));
                } else {
                    sb.append(" ");
                }
            }

            int end = sb.length() - 1;
            while (end >= 0 && sb.charAt(end) == ' ') {
                end--;
            }

            res.add(sb.substring(0, end + 1));
        }

        return res;
    }
}