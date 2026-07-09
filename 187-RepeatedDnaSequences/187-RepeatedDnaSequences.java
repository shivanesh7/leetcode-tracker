// Last updated: 7/9/2026, 9:50:38 AM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen=new HashSet<>(),ans=new HashSet<>();
        for(int i=0;i+10<=s.length();i++){
            String sub=s.substring(i,i+10);
            if(!seen.add(sub)) ans.add(sub);
        }
        return new ArrayList<>(ans);
    }
}