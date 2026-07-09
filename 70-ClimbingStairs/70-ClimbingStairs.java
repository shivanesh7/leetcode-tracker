// Last updated: 7/9/2026, 9:51:30 AM
class Solution {
    public int climbStairs(int n) 
    {
        if(n<=2)
        return n;

        int first = 1;
        int second =2 ;
        int result =0;
        for(int i=3;i<=n;i++)
        {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}