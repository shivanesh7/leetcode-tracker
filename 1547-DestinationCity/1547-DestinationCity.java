// Last updated: 7/9/2026, 9:46:23 AM
class Solution {
    public String destCity(List<List<String>> paths) 
    {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<paths.size();i++)
        {
            set.add(paths.get(i).get(0));
        }

        for(int i=0;i<paths.size();i++)
        {
            String m = paths.get(i).get(1);
            if(!set.contains(m))
            {
                return m;
            }
        }
        return "";
        
    }
}