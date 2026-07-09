// Last updated: 7/9/2026, 9:50:42 AM
class Solution {
    public int titleToNumber(String columnTitle) 
    {
        int result =0;
        for(int i=0;i<columnTitle.length();i++)
        {
            char c = columnTitle.charAt(i);
            int value = c - 'A'+1;
            result= result*26 + value;
        }
        return result;
    }
}