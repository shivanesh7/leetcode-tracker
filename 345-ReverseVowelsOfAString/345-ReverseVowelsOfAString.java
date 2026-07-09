// Last updated: 7/9/2026, 9:49:43 AM
class Solution 
{
    public String reverseVowels(String s) 
    {
        char[] ch=s.toCharArray();
        int left=0;
        int right = ch.length-1;
        while(left<right)
        {
            if("aeiouAEIOU".indexOf(ch[left])!=-1)
            {
                if("aeiouAEIOU".indexOf(ch[right])!=-1)
                {
                    char temp = ch[right];
                    ch[right]= ch [left];
                    ch[left]=temp;
                    left++;
                    right--;
                }
                else
                {
                    right--;
                }
            }
            else
            {
                left++;
            }
           
        }
        return String.valueOf(ch);
    }
}