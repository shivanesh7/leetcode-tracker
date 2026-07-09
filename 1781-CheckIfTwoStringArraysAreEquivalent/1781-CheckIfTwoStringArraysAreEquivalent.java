// Last updated: 7/9/2026, 9:46:12 AM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String s1 ="";
        String s2 ="";
        for(int i=0;i<word1.length;i++)
        {
            s1+=word1[i];
        }
        for(int i=0;i<word2.length;i++)
        {
            s2+=word2[i];
        }
        if(s1.equals(s2))
        {
            return true;
        }
        return false;
    }
}