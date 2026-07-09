// Last updated: 7/9/2026, 9:48:53 AM
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int ans=0;

        Map<Long,Integer>[] dp=new HashMap[n];

        for(int i=0;i<n;i++){
            dp[i]=new HashMap<>();

            for(int j=0;j<i;j++){
                long diff=(long)nums[i]-nums[j];

                int cnt=dp[j].getOrDefault(diff,0);

                ans+=cnt;

                dp[i].put(diff,
                    dp[i].getOrDefault(diff,0)+cnt+1);
            }
        }

        return ans;
    }
}