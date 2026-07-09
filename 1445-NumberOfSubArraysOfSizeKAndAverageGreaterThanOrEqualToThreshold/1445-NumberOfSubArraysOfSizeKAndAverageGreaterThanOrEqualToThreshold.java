// Last updated: 7/9/2026, 9:46:40 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
        int count =0;
        for(int i=0;i<=arr.length-k;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum+=arr[j];
            }
            int ans=sum/k;
            if(ans>=threshold)
            {
                count++;
            }
        }
        return count;
        
    }
}