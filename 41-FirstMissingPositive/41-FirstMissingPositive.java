// Last updated: 7/9/2026, 9:51:46 AM
class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        Arrays.sort(nums);
        int miss =1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==miss)
            {
                miss++;
            }
        }
        return miss;
        
    }
}