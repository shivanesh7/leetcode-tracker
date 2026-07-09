// Last updated: 7/9/2026, 9:51:23 AM
class Solution {
    public String minWindow(String s, String t) {
        int[] cnt=new int[128];
        for(char c:t.toCharArray()) cnt[c]++;
        int l=0,r=0,start=0,len=Integer.MAX_VALUE,need=t.length();
        while(r<s.length()){
            if(cnt[s.charAt(r++)]-- >0) need--;
            while(need==0){
                if(r-l<len){
                    len=r-l;
                    start=l;
                }
                if(++cnt[s.charAt(l++)]>0) need++;
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }
}