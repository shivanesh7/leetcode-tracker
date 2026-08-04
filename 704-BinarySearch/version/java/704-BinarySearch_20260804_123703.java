// Last updated: 8/4/2026, 12:37:03 PM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) 
6    {
7        int left=1;
8        int right=n;
9
10        while(left<right)
11        {
12            int mid = left+(right-left)/2;
13            if(isBadVersion(mid))
14            {
15                right= mid;
16            }
17            else
18            {
19                left=mid+1;
20            }
21
22        }
23        return left;
24        
25    }
26}