// Last updated: 7/9/2026, 9:47:12 AM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> rank = new HashMap<>();
        int r = 1;

        for (int num : temp) {
            if (!rank.containsKey(num)) {
                rank.put(num, r++);
            }
        }

        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = rank.get(arr[i]);
        }

        return res;
    }
}