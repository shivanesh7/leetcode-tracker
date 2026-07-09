// Last updated: 7/9/2026, 9:50:36 AM
class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        int m =0;
        int []newl = new int[n];
        if(n>1)
        {
            k=k%n;
            for(int i=n-k;i<n;i++)
            {
                newl[m++]=nums[i];
            }
            for(int i =0;i<n-k;i++)
            {
                newl[m++]=nums[i];
            }
            for(int i=0;i<n;i++)
            {
                nums[i]=newl[i];
            }
        }
        
    }
}