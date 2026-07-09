// Last updated: 7/9/2026, 9:48:00 AM
class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        String suffix = "a";

        for (String w : words) {
            char c = Character.toLowerCase(w.charAt(0));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.append(w);
            } else {
                sb.append(w.substring(1)).append(w.charAt(0));
            }

            sb.append("ma").append(suffix).append(" ");
            suffix += "a";
        }

        return sb.toString().trim();
    }
}