// Last updated: 7/9/2026, 9:48:22 AM
class Solution {
    public String fractionAddition(String expression) {
        int num = 0, den = 1, i = 0, n = expression.length();

        while (i < n) {
            int sign = 1;

            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                sign = expression.charAt(i++) == '-' ? -1 : 1;
            }

            int a = 0;
            while (expression.charAt(i) != '/') {
                a = a * 10 + expression.charAt(i++) - '0';
            }

            i++;

            int b = 0;
            while (i < n && Character.isDigit(expression.charAt(i))) {
                b = b * 10 + expression.charAt(i++) - '0';
            }

            a *= sign;

            num = num * b + a * den;
            den *= b;

            int g = gcd(Math.abs(num), den);
            num /= g;
            den /= g;
        }

        return num + "/" + den;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}