// Last updated: 7/9/2026, 9:45:32 AM
class Solution {
    public int alternatingSum(int[] nums) 
    {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(i%2==0)
            {
                sum+=nums[i];
            }
            else
            {
                sum-=nums[i];
            }
        }
        return sum;

        
    }
}