// Last updated: 7/9/2026, 9:47:06 AM
class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        String[] name = new String[n];
        int[] time = new int[n];
        int[] amount = new int[n];
        String[] city = new String[n];

        for (int i = 0; i < n; i++) {
            String[] parts = transactions[i].split(",");
            name[i] = parts[0];
            time[i] = Integer.parseInt(parts[1]);
            amount[i] = Integer.parseInt(parts[2]);
            city[i] = parts[3];
        }

        boolean[] invalid = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (amount[i] > 1000) {
                invalid[i] = true;
            }

            for (int j = 0; j < n; j++) {
                if (i != j &&
                    name[i].equals(name[j]) &&
                    Math.abs(time[i] - time[j]) <= 60 &&
                    !city[i].equals(city[j])) {
                    invalid[i] = true;
                }
            }
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (invalid[i]) {
                res.add(transactions[i]);
            }
        }

        return res;
    }
}