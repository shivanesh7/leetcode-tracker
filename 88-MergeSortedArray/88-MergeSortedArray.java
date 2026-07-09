// Last updated: 7/9/2026, 9:51:16 AM
class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        
        for(int i =0;i<nums2.length;i++)
        {
            
            nums1[i+m]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}