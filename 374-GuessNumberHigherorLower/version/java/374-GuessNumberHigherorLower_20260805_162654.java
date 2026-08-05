// Last updated: 8/5/2026, 4:26:54 PM
1public class Solution extends GuessGame {
2    public int guessNumber(int n) {
3        int left = 1;
4        int right = n;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            int result = guess(mid);
10
11            if (result == 0) {
12                return mid; 
13            } else if (result == -1) {
14                right = mid - 1; 
15            } else {
16                left = mid + 1; 
17            }
18        }
19
20        return -1; 
21    }
22}