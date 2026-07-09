// Last updated: 7/9/2026, 9:48:43 AM
class Solution {
    public String licenseKeyFormatting(String s, int k) 
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                sb.append(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                char up = Character.toUpperCase(ch);
                sb.append(up);
            }
            else if(Character.isUpperCase(ch))
            {
                sb.append(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        int count =0;
        for(int i=sb.length()-1;i>=0;i--)
        {
            res.append(sb.charAt(i));
            count++;

            if(count ==k&& i!=0)
            {
                res.append('-');
                count=0;
            }
        }
        return res.reverse().toString();

        
        
        
    }
}