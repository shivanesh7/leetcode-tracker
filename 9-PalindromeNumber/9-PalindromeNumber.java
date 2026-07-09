// Last updated: 7/9/2026, 9:52:09 AM
class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if (x < 0) return false;

        int original = x;
        int sum = 0;
        int rev = 0;

        while (x > 0)
        {
            sum = x % 10;
            rev = rev * 10 + sum;
            x /= 10;
            
        } 
        
        return original == rev;
    }
}
