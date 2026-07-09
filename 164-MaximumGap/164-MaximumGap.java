// Last updated: 7/9/2026, 9:50:49 AM
class Solution {
    public int maximumGap(int[] nums) 
    {
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            int diff=nums[i+1]-nums[i];
            max = Math.max(max,diff);
        }
        return max;
        
    }
}