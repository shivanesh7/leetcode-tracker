// Last updated: 7/9/2026, 9:45:51 AM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) 
    {
        int n = names.length;
       HashMap<Integer,String> map = new HashMap<>();
       for(int i=0;i<n;i++)
       {
            map.put(heights[i],names[i]);
       }
       Arrays.sort(heights);
       String []result = new String[n];
       int k=0;
       for(int i=heights.length-1;i>=0;i--)
       {
            result[k++]=map.get(heights[i]);
       }
       return result;
        
        
    }
}