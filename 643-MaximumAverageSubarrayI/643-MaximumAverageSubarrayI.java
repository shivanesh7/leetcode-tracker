// Last updated: 7/9/2026, 9:48:21 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        double max = Double.NEGATIVE_INFINITY;
        
        for(int i=0;i<=nums.length-k;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum+=nums[j];
            }
            double ans = (double)sum/k;
            max = Math.max(ans,max);
            
        }
        return max;
        

       
        
    }
}