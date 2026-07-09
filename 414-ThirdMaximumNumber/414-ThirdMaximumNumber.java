// Last updated: 7/9/2026, 9:49:08 AM
class Solution {
    public int thirdMax(int[] nums) 
    {
        TreeSet<Integer> set= new TreeSet<>();
        for(int num:nums)
        {
            set.add(num);
            if(set.size()>3)
            {
                set.pollFirst();
            }
        }
        if(set.size()==3)
        return set.first();
        else
        return set.last();

        
    }
}