// Last updated: 7/9/2026, 9:47:33 AM
class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int ans=0;
        int arr[]=new int [nums.length];
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=nums[i]*nums[i];
            arr[a]=ans;
            a++;


        }
        Arrays.sort(arr);
        return arr;
        
    }
}