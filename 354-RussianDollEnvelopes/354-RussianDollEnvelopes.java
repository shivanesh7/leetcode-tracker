// Last updated: 7/9/2026, 9:49:36 AM
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b)->
            a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);

        int[] dp=new int[envelopes.length];
        int len=0;

        for(int[] e:envelopes){
            int h=e[1];
            int i=Arrays.binarySearch(dp,0,len,h);

            if(i<0) i=-(i+1);

            dp[i]=h;

            if(i==len) len++;
        }

        return len;
    }
}