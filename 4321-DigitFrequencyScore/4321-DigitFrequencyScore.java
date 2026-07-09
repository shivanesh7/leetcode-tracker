// Last updated: 7/9/2026, 9:45:31 AM
class Solution {
    public int digitFrequencyScore(int n) 
    {
        int freq[]= new int[10];
        while(n>0)
        {
            int digit=n%10;
            freq[digit]++;
            n/=10;
        }
        int result =0;
        for(int d=0;d<=9;d++)
        {
            if(freq[d]>0)
            {
                result+=d*freq[d];
            }
        }
        return result;
        
        
        
    }
}