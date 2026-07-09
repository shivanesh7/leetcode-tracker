// Last updated: 7/9/2026, 9:47:18 AM
class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder sb = new StringBuilder();
        int currRow = 0, currCol = 0;

        for (char c : target.toCharArray()) {
            int idx = c - 'a';
            int row = idx / 5;
            int col = idx % 5;

            while (currRow > row) {
                sb.append('U');
                currRow--;
            }

            while (currCol > col) {
                sb.append('L');
                currCol--;
            }

            while (currRow < row) {
                sb.append('D');
                currRow++;
            }

            while (currCol < col) {
                sb.append('R');
                currCol++;
            }

            sb.append('!');
        }

        return sb.toString();
    }
}