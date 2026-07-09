// Last updated: 7/9/2026, 9:48:12 AM
class Solution {
    public String toLowerCase(String s) 
    {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&& ch<='Z')
            {
                ch=(char)(ch+32);
            }
            result+=ch; 
        } 
        return result;     
    }
}