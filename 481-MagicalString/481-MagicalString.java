// Last updated: 7/9/2026, 9:48:45 AM
class Solution {
    public int magicalString(int n) {
        if(n<=0) return 0;
        if(n<=3) return 1;

        int[] a=new int[n+2];
        a[0]=1;
        a[1]=2;
        a[2]=2;

        int head=2,tail=3,num=1,ans=1;

        while(tail<n){
            for(int i=0;i<a[head]&&tail<n;i++){
                a[tail]=num;
                if(num==1) ans++;
                tail++;
            }
            num=3-num;
            head++;
        }

        return ans;
    }
}