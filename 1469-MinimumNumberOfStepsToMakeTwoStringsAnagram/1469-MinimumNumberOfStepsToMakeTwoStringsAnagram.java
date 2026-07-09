// Last updated: 7/9/2026, 9:46:33 AM
class Solution 
{
    public int minSteps(String s, String t) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch :s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }      

        int step =0;
        for(char ch:t.toCharArray())
        {
            if(map.containsKey(ch)&& map.get(ch)>0)
            {
                map.put(ch,map.get(ch)-1);
            }
            else
            {
                step++;
            }
        }
        return step;
    }
}