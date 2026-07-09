// Last updated: 7/9/2026, 9:50:07 AM
class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<=n;i++)
        {
            int count=0;
            for(int j =0;j<n;j++)
            {
                if(nums[j]==i)
                {
                    count=1;
                    break;
                }

            }
            if(count==0)
            {
                return i;
            }
        }
        return -1;
        
    }
}