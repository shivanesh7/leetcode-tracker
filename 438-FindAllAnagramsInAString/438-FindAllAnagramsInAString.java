// Last updated: 7/9/2026, 9:48:58 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) return res;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int window = p.length();

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;

            if (i >= window) {
                sCount[s.charAt(i - window) - 'a']--;
            }

            if (i >= window - 1 && Arrays.equals(pCount, sCount)) {
                res.add(i - window + 1);
            }
        }

        return res;
    }
}