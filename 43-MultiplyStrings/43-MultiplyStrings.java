// Last updated: 7/9/2026, 9:51:44 AM
class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n + m];

        // multiply digits
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int mul = digit1 * digit2;

                int pos1 = i + j;
                int pos2 = i + j + 1;

                int sum = mul + result[pos2];

                result[pos2] = sum % 10;
                result[pos1] += sum / 10;
            }
        }

        // build result string (without StringBuilder)
        String resultStr = "";

        for (int num : result) {
            if (!(resultStr.length() == 0 && num == 0)) {
                resultStr = resultStr + num;
            }
        }

        return resultStr.length() == 0 ? "0" : resultStr;
    }
}