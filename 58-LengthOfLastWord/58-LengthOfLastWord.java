// Last updated: 7/9/2026, 9:51:36 AM
class Solution {
    public int lengthOfLastWord(String s) 
    {
        
        String []str =s.trim().split(" ");
        
        return str[str.length-1].length();
        
    }
}