// Last updated: 7/9/2026, 9:51:41 AM
class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char []ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>();

        for (ArrayList<String> group : map.values()) 
        {
            result.add(group);   
        }
        
        return result;
        
    }
}
        
        
    
