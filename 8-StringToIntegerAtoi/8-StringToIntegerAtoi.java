// Last updated: 7/9/2026, 9:52:11 AM
class Solution {
    public int myAtoi(String s) 
    {
        s=s.trim();
        if(s.length()==0)
        return 0;

        int sign=1;
        int index=0;
        if(s.charAt(0)=='-')
        {
            sign=-1;
            index++;
        }
        else if(s.charAt(0)=='+')
        {
            index++;
        }
        long result=0;
        while(index<s.length() && s.charAt(index)>='0'&&s.charAt(index)<='9')
        {
            result=result*10+(s.charAt(index)-'0');
            if(sign * result > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(sign*result < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return(int)(sign*result);

        
    }
}