// Last updated: 7/9/2026, 9:48:10 AM
class Solution {
    public int dominantIndex(int[] nums) 
    {
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                index=i;
            }
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(2*nums[i]>max && index!=i)
            {
                return -1;
            }
            
        }
        return index;
        
    }
}