// Last updated: 7/9/2026, 9:48:35 AM
class Solution {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            String word = words[i].toLowerCase();

            
            boolean r1 = true;
            for (int j = 0; j < word.length(); j++) {
                if (row1.indexOf(word.charAt(j)) == -1) {
                    r1 = false;
                    break;
                }
            }

            
            boolean r2 = true;
            for (int j = 0; j < word.length(); j++) {
                if (row2.indexOf(word.charAt(j)) == -1) {
                    r2 = false;
                    break;
                }
            }

            
            boolean r3 = true;
            for (int j = 0; j < word.length(); j++) {
                if (row3.indexOf(word.charAt(j)) == -1) {
                    r3 = false;
                    break;
                }
            }

            
            if (r1 || r2 || r3) {
                list.add(words[i]);
            }
        }

        return list.toArray(new String[0]);
    }
}