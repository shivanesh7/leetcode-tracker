// Last updated: 7/9/2026, 9:49:27 AM
class Solution {
    public char findTheDifference(String s, String t) 
    {
        char[]ch1 = s.toCharArray();
        char[]ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int n=0;
        
    
        for(int i=0;i<ch1.length;i++)
        {
           if(ch1[i]!=ch2[i])
           {
                return ch2[i];
           }
        }
        return ch2[ch2.length-1];
    }
}