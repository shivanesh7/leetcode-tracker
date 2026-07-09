// Last updated: 7/9/2026, 9:46:07 AM
class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            return solve(s, 'b', 'a', y, x);
        } else {
            return solve(s, 'a', 'b', x, y);
        }
    }

    private int solve(String s, char first, char second, int firstScore, int secondScore) {
        int score = 0;
        StringBuilder sb = new StringBuilder();

        // remove higher score pair first
        for (char c : s.toCharArray()) {
            if (c == second && sb.length() > 0 && sb.charAt(sb.length() - 1) == first) {
                sb.deleteCharAt(sb.length() - 1);
                score += firstScore;
            } else {
                sb.append(c);
            }
        }

        StringBuilder sb2 = new StringBuilder();

        for (char c : sb.toString().toCharArray()) {
            if (c == first && sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == second) {
                sb2.deleteCharAt(sb2.length() - 1);
                score += secondScore;
            } else {
                sb2.append(c);
            }
        }

        return score;
    }
}