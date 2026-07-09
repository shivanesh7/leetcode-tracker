// Last updated: 7/9/2026, 9:48:25 AM
class Solution {
    public int arrayNesting(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 0;
            int curr = i;

            while (!visited[curr]) {
                visited[curr] = true;
                curr = nums[curr];
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}