// Last updated: 7/9/2026, 9:46:52 AM
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        List<List<String>> res = new ArrayList<>();
        String prefix = "";

        for (char c : searchWord.toCharArray()) {
            prefix += c;

            List<String> list = new ArrayList<>();

            for (String p : products) {
                if (p.startsWith(prefix)) {
                    list.add(p);
                    if (list.size() == 3) break;
                }
            }

            res.add(list);
        }

        return res;
    }
}