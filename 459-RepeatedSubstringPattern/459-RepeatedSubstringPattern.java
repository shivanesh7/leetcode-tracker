// Last updated: 7/9/2026, 9:48:48 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) 
    {
        String t = s+s;
        return t.substring(1,t.length()-1).contains(s);
        
    }
}