// Last updated: 7/9/2026, 9:46:22 AM
class Solution 
{
    public boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) 
    {
        int max=0;
        int count =0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        max=count;

        for(int i=k;i<s.length();i++)
        {
            if(isVowel(s.charAt(i-k)))
            {
                count--;
            }
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}