// Last updated: 7/9/2026, 9:51:50 AM
class Solution {
    public int search(int[] nums, int target) 
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
        
    }
}