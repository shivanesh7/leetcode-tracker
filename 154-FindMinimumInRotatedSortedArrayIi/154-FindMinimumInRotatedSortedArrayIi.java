// Last updated: 7/9/2026, 9:50:52 AM
class Solution {
    public int findMin(int[] nums) 
    {
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        return min;
        
    }
}