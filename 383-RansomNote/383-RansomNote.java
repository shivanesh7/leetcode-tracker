// Last updated: 7/9/2026, 9:49:30 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int[] freq = new int[26];
        for(int i =0;i<magazine.length();i++)
        {
            char c = magazine.charAt(i);
            freq[c-'a']++;
        }
        for(int i =0;i<ransomNote.length();i++)
        {
            char c=ransomNote.charAt(i);
            if(--freq[c-'a']<0)
            {
                return false;
            }
        }   
        return true;
       
       
       
       
    
    }
}