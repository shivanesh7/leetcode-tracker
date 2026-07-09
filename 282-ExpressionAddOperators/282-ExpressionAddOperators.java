// Last updated: 7/9/2026, 9:50:06 AM
class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        dfs(res, num, target, 0, 0, 0, "");
        return res;
    }

    private void dfs(List<String> res, String num, int target, int index, long value, long prev, String path) {
        if (index == num.length()) {
            if (value == target) res.add(path);
            return;
        }

        for (int i = index; i < num.length(); i++) {
            if (i != index && num.charAt(index) == '0') break;

            long curr = Long.parseLong(num.substring(index, i + 1));

            if (index == 0) {
                dfs(res, num, target, i + 1, curr, curr, path + curr);
            } else {
                dfs(res, num, target, i + 1, value + curr, curr, path + "+" + curr);
                dfs(res, num, target, i + 1, value - curr, -curr, path + "-" + curr);
                dfs(res, num, target, i + 1, value - prev + prev * curr, prev * curr, path + "*" + curr);
            }
        }
    }
}