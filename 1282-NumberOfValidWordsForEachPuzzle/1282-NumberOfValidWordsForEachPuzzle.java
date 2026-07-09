// Last updated: 7/9/2026, 9:47:01 AM
class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (String w : words) {
            int mask = getMask(w);
            freq.put(mask, freq.getOrDefault(mask, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();

        for (String p : puzzles) {
            int mask = getMask(p);
            int first = 1 << (p.charAt(0) - 'a');

            int sub = mask;
            int count = 0;

            while (true) {
                if ((sub & first) != 0) {
                    count += freq.getOrDefault(sub, 0);
                }

                if (sub == 0) break;

                sub = (sub - 1) & mask;
            }

            res.add(count);
        }

        return res;
    }

    private int getMask(String s) {
        int mask = 0;
        for (char c : s.toCharArray()) {
            mask |= 1 << (c - 'a');
        }
        return mask;
    }
}