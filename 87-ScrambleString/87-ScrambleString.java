// Last updated: 7/9/2026, 9:51:17 AM
class Solution {
    Map<String,Boolean> map=new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2)) return true;

        String key=s1+" "+s2;
        if(map.containsKey(key)) return map.get(key);

        int[] cnt=new int[26];
        for(int i=0;i<s1.length();i++){
            cnt[s1.charAt(i)-'a']++;
            cnt[s2.charAt(i)-'a']--;
        }

        for(int x:cnt){
            if(x!=0){
                map.put(key,false);
                return false;
            }
        }

        int n=s1.length();

        for(int i=1;i<n;i++){
            if(isScramble(s1.substring(0,i),s2.substring(0,i)) &&
               isScramble(s1.substring(i),s2.substring(i))){
                map.put(key,true);
                return true;
            }

            if(isScramble(s1.substring(0,i),s2.substring(n-i)) &&
               isScramble(s1.substring(i),s2.substring(0,n-i))){
                map.put(key,true);
                return true;
            }
        }

        map.put(key,false);
        return false;
    }
}