// Last updated: 7/9/2026, 9:45:44 AM
class Solution {
    public int missingInteger(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        for(int x : nums)
        {
            set.add(x);
        }
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                sum+=nums[i];
            }
            else
            {
                break;
            }
        }
        int target=sum;
        
        while(set.contains(target))
        {
            target++;
        }
        return target;
        
    }
}