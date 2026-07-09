// Last updated: 7/9/2026, 9:50:16 AM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length,idx=0;
        int[] ans=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!dq.isEmpty()&&dq.peek()<i-k+1) dq.poll();
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]) dq.pollLast();
            dq.offer(i);
            if(i>=k-1) ans[idx++]=nums[dq.peek()];
        }
        return ans;
    }
}