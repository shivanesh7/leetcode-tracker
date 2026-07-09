// Last updated: 7/9/2026, 9:46:48 AM
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];

            map.putIfAbsent(size, new ArrayList<>());
            map.get(size).add(i);

            if (map.get(size).size() == size) {
                res.add(new ArrayList<>(map.get(size)));
                map.get(size).clear();
            }
        }

        return res;
    }
}