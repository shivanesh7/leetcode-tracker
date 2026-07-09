// Last updated: 7/9/2026, 9:49:00 AM
class Solution {
    public int countSegments(String s) 
    {
        if(s.isEmpty())
        {
            return 0;
        }
        
        String[]words = s.split(" ");
        int count =0;
        for(String word : words)
        {
            if(!word.isEmpty())
            {
                count++;
            }
        }
        return count;
    }
}