// Last updated: 7/9/2026, 9:51:13 AM
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<>();
        backtrack(s,0,0,"",ans);
        return ans;
    }

    void backtrack(String s,int idx,int part,String cur,List<String> ans){
        if(part==4&&idx==s.length()){
            ans.add(cur.substring(0,cur.length()-1));
            return;
        }
        if(part==4||idx==s.length()) return;

        for(int len=1;len<=3&&idx+len<=s.length();len++){
            String str=s.substring(idx,idx+len);
            if((str.length()>1&&str.charAt(0)=='0')||Integer.parseInt(str)>255) continue;
            backtrack(s,idx+len,part+1,cur+str+".",ans);
        }
    }
}