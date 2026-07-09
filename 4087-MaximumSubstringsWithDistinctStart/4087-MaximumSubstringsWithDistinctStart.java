// Last updated: 7/9/2026, 9:45:29 AM
class Solution 
{
    public int maxDistinct(String s) 
    {
        //char ch[]= s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int count =0;
        for(char ch:s.toCharArray())
        {
            if(!set.contains(ch))
            {
                set.add(ch);
                count++;
            }
        }
        return count;
    }
}        

