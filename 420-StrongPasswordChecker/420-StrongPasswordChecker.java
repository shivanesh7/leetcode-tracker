// Last updated: 7/9/2026, 9:49:03 AM
class Solution {
    public int strongPasswordChecker(String s) {
        int n=s.length();
        int lower=1,upper=1,digit=1;

        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)) lower=0;
            else if(Character.isUpperCase(c)) upper=0;
            else if(Character.isDigit(c)) digit=0;
        }

        int miss=lower+upper+digit;

        if(n<6) return Math.max(miss,6-n);

        int replace=0,one=0,two=0;

        for(int i=0;i<n;){
            int j=i;
            while(j<n&&s.charAt(j)==s.charAt(i)) j++;

            int len=j-i;

            if(len>=3){
                replace+=len/3;
                if(len%3==0) one++;
                else if(len%3==1) two++;
            }

            i=j;
        }

        if(n<=20) return Math.max(miss,replace);

        int del=n-20;
        int ans=del;

        int use=Math.min(del,one);
        replace-=use;
        del-=use;

        use=Math.min(del,two*2);
        replace-=use/2;
        del-=use;

        replace-=del/3;

        return ans+Math.max(miss,replace);
    }
}