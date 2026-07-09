// Last updated: 7/9/2026, 9:46:09 AM
class Solution {
    public String reformatNumber(String number) {
        StringBuilder digits = new StringBuilder();

        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        StringBuilder res = new StringBuilder();
        int i = 0;
        int n = digits.length();

        while (n > 4) {
            res.append(digits, i, i + 3).append("-");
            i += 3;
            n -= 3;
        }

        if (n == 4) {
            res.append(digits, i, i + 2).append("-")
               .append(digits, i + 2, i + 4);
        } else {
            res.append(digits.substring(i));
        }

        return res.toString();
    }
}