// Last updated: 7/9/2026, 9:45:43 AM
class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxfreq=0;
        for(int freq :map.values())
        {
            if(freq>maxfreq)
            {
                maxfreq=freq;
            }
        }
        int count =0;
        for(int num :map.values())
        {
            if(num==maxfreq)
            count++;
        }
        return count*maxfreq;


        
    }
}