// Last updated: 7/9/2026, 9:46:02 AM
class Solution {
    public int minPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int max=0;
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int temp=nums[left]+nums[right];
            max=Math.max(temp,max);
            left++;
            right--;
        }
        return max;
    }
}