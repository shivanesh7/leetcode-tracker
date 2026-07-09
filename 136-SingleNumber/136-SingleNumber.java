// Last updated: 7/9/2026, 9:50:59 AM
class Solution 
{
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}