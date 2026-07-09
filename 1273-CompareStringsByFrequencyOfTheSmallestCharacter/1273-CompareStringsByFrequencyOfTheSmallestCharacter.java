// Last updated: 7/9/2026, 9:47:05 AM
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] freq = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            freq[i] = f(words[i]);
        }

        Arrays.sort(freq);

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int q = f(queries[i]);

            int idx = upperBound(freq, q);
            res[i] = freq.length - idx;
        }

        return res;
    }

    private int f(String s) {
        char min = 'z';
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c < min) {
                min = c;
                count = 1;
            } else if (c == min) {
                count++;
            }
        }

        return count;
    }

    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;

        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] <= target) l = m + 1;
            else r = m;
        }

        return l;
    }
}