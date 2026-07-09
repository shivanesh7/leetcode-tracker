// Last updated: 7/9/2026, 9:50:35 AM
class Solution {
    public int hammingWeight(int n) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        while(n!=0)
        {
            if((n&1)==1)
            {
                c++;
            }
            n=n>>1;
        }
        return c;
    }
}