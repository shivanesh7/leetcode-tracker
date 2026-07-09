// Last updated: 7/9/2026, 9:46:55 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer>set = new HashSet<>(map.values());

        return map.size()==set.size();
        
    }
}