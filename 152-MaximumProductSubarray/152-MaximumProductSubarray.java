// Last updated: 7/9/2026, 9:50:54 AM
class Solution {
    public int maxProduct(int[] nums) 
    {
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            int product=1;
            for(int j=i;j<nums.length;j++)
            {
                product*=nums[j];
                if(product>max)
                {
                    max=product;
                }
            }
        }
        return max;
        
    }
}