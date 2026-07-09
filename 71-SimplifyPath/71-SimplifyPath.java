// Last updated: 7/9/2026, 9:51:28 AM
class Solution {
    public String simplifyPath(String path) {
        Deque<String> st=new ArrayDeque<>();
        for(String s:path.split("/")){
            if(s.equals("")||s.equals(".")) continue;
            if(s.equals("..")){
                if(!st.isEmpty()) st.pollLast();
            }else st.offerLast(s);
        }
        StringBuilder sb=new StringBuilder();
        for(String s:st) sb.append("/").append(s);
        return sb.length()==0?"/":sb.toString();
    }
}