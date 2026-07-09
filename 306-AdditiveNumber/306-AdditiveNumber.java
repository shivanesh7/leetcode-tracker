// Last updated: 7/9/2026, 9:49:56 AM
class Solution {
    public boolean isAdditiveNumber(String num) {
        int n=num.length();
        for(int i=1;i<=n/2;i++){
            if(num.charAt(0)=='0'&&i>1) break;
            for(int j=1;Math.max(i,j)<=n-i-j;j++){
                if(num.charAt(i)=='0'&&j>1) break;
                if(check(num,0,i,i+j)) return true;
            }
        }
        return false;
    }

    boolean check(String num,int a,int b,int c){
        if(c==num.length()) return true;

        long x=Long.parseLong(num.substring(a,b));
        long y=Long.parseLong(num.substring(b,c));
        String sum=String.valueOf(x+y);

        return num.startsWith(sum,c) &&
               check(num,b,c,c+sum.length());
    }
}