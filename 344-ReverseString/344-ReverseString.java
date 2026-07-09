// Last updated: 7/9/2026, 9:49:44 AM
class Solution 
{
    public void reverseString(char[] s) 
    {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        for(int i =0;i<s.length;i++)
        {
            s[i]=sb.charAt(i);
        } 
    }
}