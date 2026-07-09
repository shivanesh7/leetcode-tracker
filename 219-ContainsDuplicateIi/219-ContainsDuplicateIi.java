// Last updated: 7/9/2026, 9:50:24 AM
class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap<Integer,Integer>map= new HashMap<>();

        for(int i =0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int prevIndex = map.get(nums[i]);

                if(i - prevIndex <= k)
                {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
        
    }
}