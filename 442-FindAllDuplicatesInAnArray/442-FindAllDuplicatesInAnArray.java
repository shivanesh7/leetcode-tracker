// Last updated: 7/9/2026, 9:48:57 AM
import java.util.*;

class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> added = new HashSet<>(); 
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) 
        {
            int num = nums[i];
            if (!seen.add(num)) 
            {           
                if (added.add(num)) 
                {      
                    duplicates.add(num);
                }
            }
        }
        return duplicates;
    }
}
