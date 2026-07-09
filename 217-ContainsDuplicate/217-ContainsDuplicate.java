// Last updated: 7/9/2026, 9:50:26 AM
class Solution 
{
    public boolean containsDuplicate(int[] nums)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet())
        {
            if(map.get(key)>1)
            return true;
        }
        return false;
    }
}