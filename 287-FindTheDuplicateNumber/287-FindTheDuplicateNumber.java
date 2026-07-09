// Last updated: 7/9/2026, 9:50:02 AM
import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i]; 
            }
        }
        return -1; 
    }
}
