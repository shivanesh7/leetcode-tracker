// Last updated: 7/9/2026, 9:47:46 AM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];

        for (String b : words2) {
            int[] freq = count(b);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        List<String> res = new ArrayList<>();

        for (String a : words1) {
            int[] freq = count(a);
            if (isValid(freq, maxFreq)) {
                res.add(a);
            }
        }

        return res;
    }

    private int[] count(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    private boolean isValid(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] < b[i]) return false;
        }
        return true;
    }
}