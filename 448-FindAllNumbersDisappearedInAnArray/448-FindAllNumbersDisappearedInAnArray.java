// Last updated: 7/9/2026, 9:48:51 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i =1;i<=nums.length;i++)
        {
            if(!set.contains(i))
            {
                result.add(i);
            }
            
        }
        return result;
    }
}