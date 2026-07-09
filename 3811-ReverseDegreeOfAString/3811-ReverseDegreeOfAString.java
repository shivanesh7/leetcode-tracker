// Last updated: 7/9/2026, 9:45:38 AM
class Solution {
    public int reverseDegree(String s) 
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            int value=26-(ch-'a');
            sum+= value * (i+1);
        }
        return sum;
        
    }
}