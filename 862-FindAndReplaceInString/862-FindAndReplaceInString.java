// Last updated: 7/9/2026, 9:47:57 AM
class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length();
        String[] replace = new String[n];
        int[] len = new int[n];

        Arrays.fill(len, 0);

        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            String src = sources[i];

            if (s.startsWith(src, idx)) {
                replace[idx] = targets[i];
                len[idx] = src.length();
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; ) {
            if (replace[i] != null) {
                sb.append(replace[i]);
                i += len[i];
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }
}