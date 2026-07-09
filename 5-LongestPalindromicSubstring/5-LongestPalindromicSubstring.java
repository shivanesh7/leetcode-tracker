// Last updated: 7/9/2026, 9:52:14 AM
class Solution {
    public String longestPalindrome(String s) 
    {
        int start =0;
        int end =0;

        for(int i=0;i<s.length();i++)
        {
            int left=i;
            int right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if(right-left > end-start)
                {
                    start = left;
                    end =right;

                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
             while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if(right-left > end-start)
                {
                    start = left;
                    end =right;

                }
                left--;
                right++;
            }


        }
        return s.substring(start,end+1);
    }
}