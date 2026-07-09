// Last updated: 7/9/2026, 9:47:35 AM
class Solution {
    public String largestTimeFromDigits(int[] arr) {
        String res = "";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {

                        if (i == j || i == k || i == l || j == k || j == l || k == l)
                            continue;

                        int h1 = arr[i], h2 = arr[j];
                        int m1 = arr[k], m2 = arr[l];

                        int hour = h1 * 10 + h2;
                        int minute = m1 * 10 + m2;

                        if (hour < 24 && minute < 60) {
                            String time = String.format("%02d:%02d", hour, minute);
                            if (res.compareTo(time) < 0) {
                                res = time;
                            }
                        }
                    }
                }
            }
        }

        return res;
    }
}