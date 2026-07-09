// Last updated: 7/9/2026, 9:47:27 AM
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];

        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int res = 0;

        for (String w : words) {
            if (canForm(w, freq)) {
                res += w.length();
            }
        }

        return res;
    }

    private boolean canForm(String word, int[] freq) {
        int[] temp = new int[26];

        for (char c : word.toCharArray()) {
            temp[c - 'a']++;
            if (temp[c - 'a'] > freq[c - 'a']) return false;
        }

        return true;
    }
}