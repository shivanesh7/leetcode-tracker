// Last updated: 7/9/2026, 9:49:14 AM
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->
            a[0]==b[0] ? a[1]-b[1] : b[0]-a[0]);

        List<int[]> list=new ArrayList<>();

        for(int[] p:people)
            list.add(p[1],p);

        return list.toArray(new int[people.length][]);
    }
}