// Last updated: 7/9/2026, 9:48:05 AM
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s.toCharArray(), 0, res);
        return res;
    }

    private void backtrack(char[] arr, int idx, List<String> res) {
        if (idx == arr.length) {
            res.add(new String(arr));
            return;
        }

        if (Character.isDigit(arr[idx])) {
            backtrack(arr, idx + 1, res);
            return;
        }

        arr[idx] = Character.toLowerCase(arr[idx]);
        backtrack(arr, idx + 1, res);

        arr[idx] = Character.toUpperCase(arr[idx]);
        backtrack(arr, idx + 1, res);
    }
}