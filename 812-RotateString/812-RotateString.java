// Last updated: 7/9/2026, 9:48:03 AM
class Solution {
    public boolean rotateString(String s, String goal) 
    {
        if(s.length()!=goal.length())
        return false;

        return (s+s).contains(goal);
        
    }
}