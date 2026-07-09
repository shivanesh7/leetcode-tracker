// Last updated: 7/9/2026, 9:46:30 AM
class Solution {
    public String rankTeams(String[] votes) {
        int n = votes[0].length();
        int[][] rank = new int[26][n];

        for (String vote : votes) {
            for (int i = 0; i < n; i++) {
                rank[vote.charAt(i) - 'A'][i]++;
            }
        }

        List<Character> list = new ArrayList<>();
        for (char c : votes[0].toCharArray()) {
            list.add(c);
        }

        Collections.sort(list, (a, b) -> {
            for (int i = 0; i < n; i++) {
                if (rank[a - 'A'][i] != rank[b - 'A'][i]) {
                    return rank[b - 'A'][i] - rank[a - 'A'][i];
                }
            }
            return a - b;
        });

        StringBuilder sb = new StringBuilder();
        for (char c : list) sb.append(c);

        return sb.toString();
    }
}