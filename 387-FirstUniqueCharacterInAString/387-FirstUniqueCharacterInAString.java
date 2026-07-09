// Last updated: 7/9/2026, 9:49:29 AM
class Solution {
    public int firstUniqChar(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i =0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            return i;
        }
        return -1;
    }
}