// Last updated: 7/9/2026, 9:49:59 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.trim().split("\\s+");
        if (pattern.length() != words.length) return false;

        int[] map1 = new int[256];               
        java.util.HashMap<String,Integer> map2 = new java.util.HashMap<>(); 

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            int lastIndexChar = map1[ch];              
            int lastIndexWord = map2.getOrDefault(word, 0);

            if (lastIndexChar != lastIndexWord) return false;

            
            map1[ch] = i + 1;
            map2.put(word, i + 1);
        }
        return true;
    }
}
