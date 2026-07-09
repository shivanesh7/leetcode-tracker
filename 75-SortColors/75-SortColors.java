// Last updated: 7/9/2026, 9:51:24 AM
class Solution {
    public void sortColors(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++) {

            int minindex = i;

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[j] < nums[minindex]) {
                    minindex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minindex];
            nums[minindex] = temp;
        }

        
    }
}