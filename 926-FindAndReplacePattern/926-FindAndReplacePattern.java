// Last updated: 7/9/2026, 9:47:47 AM
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();

        for (String w : words) {
            if (match(w, pattern)) {
                res.add(w);
            }
        }

        return res;
    }

    private boolean match(String word, String pattern) {
        int[] m1 = new int[26];
        int[] m2 = new int[26];
        Arrays.fill(m1, -1);
        Arrays.fill(m2, -1);

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (m1[w - 'a'] != m2[p - 'a']) {
                return false;
            }

            m1[w - 'a'] = i;
            m2[p - 'a'] = i;
        }

        return true;
    }
}