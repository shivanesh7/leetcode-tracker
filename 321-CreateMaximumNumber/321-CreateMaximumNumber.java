// Last updated: 7/9/2026, 9:49:52 AM
class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] ans=new int[k];

        for(int i=Math.max(0,k-nums2.length);i<=Math.min(k,nums1.length);i++){
            int[] a=maxArray(nums1,i);
            int[] b=maxArray(nums2,k-i);
            int[] c=merge(a,b,k);

            if(greater(c,0,ans,0))
                ans=c;
        }

        return ans;
    }

    int[] maxArray(int[] nums,int k){
        int[] st=new int[k];
        int top=0,drop=nums.length-k;

        for(int num:nums){
            while(top>0&&drop>0&&st[top-1]<num){
                top--;
                drop--;
            }
            if(top<k) st[top++]=num;
            else drop--;
        }

        return st;
    }

    int[] merge(int[] a,int[] b,int k){
        int[] res=new int[k];
        int i=0,j=0,t=0;

        while(t<k)
            res[t++]=greater(a,i,b,j)?a[i++]:b[j++];

        return res;
    }

    boolean greater(int[] a,int i,int[] b,int j){
        while(i<a.length&&j<b.length&&a[i]==b[j]){
            i++;
            j++;
        }
        return j==b.length||(i<a.length&&a[i]>b[j]);
    }
}