// Last updated: 7/9/2026, 9:50:43 AM
class Solution {
    public int majorityElement(int[] nums) 
    {
        Map<Integer,Integer> map= new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet())
        {
            if(map.get(key)>nums.length/2)
            {
                return key;
            }
        }
        return 0;
        
    }
}