// Last updated: 7/9/2026, 9:49:41 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>(map.keySet());

        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        int arr[]= new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;

        
    }
}