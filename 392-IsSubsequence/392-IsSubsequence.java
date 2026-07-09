// Last updated: 7/9/2026, 9:49:24 AM
class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int i=0;
        int j = 0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i==s.length();

    }
}