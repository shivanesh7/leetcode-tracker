// Last updated: 7/9/2026, 9:50:17 AM
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++)
            if(citations[i]>=n-i)
                return n-i;
        return 0;
    }
}