// Last updated: 7/9/2026, 9:46:00 AM
class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int n = nums.length;
        int k=0;
        int ans[]= new int[n+n];
        for(int i=0;i<nums.length;i++)
        {
            ans[k]=nums[i];
            k++;
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[k]=nums[i];
            k++;
        }
        return ans;
        
    }
}