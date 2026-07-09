// Last updated: 7/9/2026, 9:49:50 AM
class Solution {
    public boolean isPowerOfThree(int n) 
    {
        if(n<=0)
        return false;
        while(n%3==0)
         n/=3;

        
        return n==1;
        
    }
}