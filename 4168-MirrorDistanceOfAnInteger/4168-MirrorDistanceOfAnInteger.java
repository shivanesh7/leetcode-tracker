// Last updated: 7/9/2026, 9:45:28 AM
class Solution {
    public int mirrorDistance(int n) 
    {
        int temp =n;
        int result=0;
        while(temp>0)
        {
            int digit=temp%10;
            result = result*10+digit;
            temp/=10;
        }
        return Math.abs(result-n);
        
    }
}