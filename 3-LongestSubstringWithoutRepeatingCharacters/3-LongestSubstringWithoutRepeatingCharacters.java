// Last updated: 7/9/2026, 9:52:16 AM
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> set = new HashSet<>();
        int left =0;
        int maxlen = 0;

        for(int right =0;right<s.length();right++)
        {
            char c =s.charAt(right);
            while(set.contains(c))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);

            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
        
    }
}