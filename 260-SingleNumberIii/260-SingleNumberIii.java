// Last updated: 7/9/2026, 9:50:10 AM
class Solution {
    public int[] singleNumber(int[] nums) 
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int key :map.keySet())
        {
            if(map.get(key)==1)
            {
                list.add(key);
            }
        }
        int arr[]= new int[list.size()];
        int x=0;
        for(int i=0;i<list.size();i++)
        {
            arr[x]=list.get(i);
            x++;
        }
        return arr;
    }
}