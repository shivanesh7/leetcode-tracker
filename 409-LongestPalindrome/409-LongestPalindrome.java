// Last updated: 7/9/2026, 9:49:11 AM
class Solution 
{
    public int longestPalindrome(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();

for (char ch : s.toCharArray()) {
    map.put(ch, map.getOrDefault(ch, 0) + 1);
}

int length = 0;
boolean hasOdd = false;

for (int count : map.values()) {
    if (count % 2 == 0) {
        length += count;
    } else {
        length += count - 1;
        hasOdd = true;
    }
}

if (hasOdd) length += 1;

return length;

        
    }
}