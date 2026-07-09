// Last updated: 7/9/2026, 9:51:34 AM
import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }

        BigInteger num = new BigInteger(sb.toString());
        num = num.add(BigInteger.ONE);

        String resultStr = num.toString();
        int[] result = new int[resultStr.length()];

        for (int i = 0; i < resultStr.length(); i++) {
            result[i] = resultStr.charAt(i) - '0';
        }

        return result;
    }
}
