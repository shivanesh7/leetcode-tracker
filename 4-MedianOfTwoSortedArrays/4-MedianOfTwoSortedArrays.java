// Last updated: 7/9/2026, 9:52:15 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n = nums1.length;
        int m = nums2.length;
        int arr[]= new int[n+m];
        int a=0;
        for(int i=0;i<nums1.length;i++)
        {
            arr[a]=nums1[i];
            a++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            arr[a]=nums2[i];
            a++;
        }
        Arrays.sort(arr);
        int r = arr.length;
        if(r%2!=0)
        {
            float ans1=arr[r/2];
            return ans1;
        }
        else
        {
            int me = r/2-1;
            double ans2=(arr[me]+arr[me+1])/2.0;
            
            return ans2;
        }
        
    }
}