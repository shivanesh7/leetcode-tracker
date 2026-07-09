// Last updated: 7/9/2026, 9:45:27 AM
class Solution {
    public int[] concatWithReverse(int[] nums) 
    {
        int n = nums.length;
        int[]newarr= new int[n+n];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            newarr[k]=nums[i];
            k++;
            
        }
        for(int i=n-1;i>=0;i--)
        {
            newarr[k]=nums[i];
            k++;
        }
        return newarr;
        
    }
}