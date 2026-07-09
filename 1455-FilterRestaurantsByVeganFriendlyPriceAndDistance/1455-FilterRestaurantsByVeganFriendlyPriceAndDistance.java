// Last updated: 7/9/2026, 9:46:36 AM
class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> list = new ArrayList<>();

        for (int[] r : restaurants) {
            int id = r[0];
            int rating = r[1];
            int vegan = r[2];
            int price = r[3];
            int distance = r[4];

            if ((veganFriendly == 0 || vegan == 1) &&
                price <= maxPrice &&
                distance <= maxDistance) {
                list.add(new int[]{id, rating});
            }
        }

        list.sort((a, b) -> {
            if (a[1] != b[1]) return b[1] - a[1];
            return b[0] - a[0];
        });

        List<Integer> res = new ArrayList<>();
        for (int[] x : list) {
            res.add(x[0]);
        }

        return res;
    }
}