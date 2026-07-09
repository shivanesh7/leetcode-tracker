// Last updated: 7/9/2026, 9:48:23 AM
class Solution {
    public boolean isValid(String code) {
        Stack<String> st=new Stack<>();
        int i=0,n=code.length();

        while(i<n){
            if(i>0&&st.isEmpty()) return false;

            if(code.startsWith("<![CDATA[",i)){
                int j=code.indexOf("]]>",i);
                if(j<0) return false;
                i=j+3;
            }
            else if(code.startsWith("</",i)){
                int j=code.indexOf('>',i);
                if(j<0) return false;

                String tag=code.substring(i+2,j);
                if(st.isEmpty()||!st.pop().equals(tag)) return false;

                i=j+1;
            }
            else if(code.startsWith("<",i)){
                int j=code.indexOf('>',i);
                if(j<0) return false;

                String tag=code.substring(i+1,j);

                if(tag.length()<1||tag.length()>9) return false;

                for(char c:tag.toCharArray())
                    if(c<'A'||c>'Z') return false;

                st.push(tag);
                i=j+1;
            }
            else{
                i++;
            }
        }

        return st.isEmpty();
    }
}