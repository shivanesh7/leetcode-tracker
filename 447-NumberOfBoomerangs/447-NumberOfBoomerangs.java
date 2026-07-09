// Last updated: 7/9/2026, 9:48:52 AM
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ans=0;

        for(int[] p:points){
            Map<Integer,Integer> map=new HashMap<>();

            for(int[] q:points){
                int dx=p[0]-q[0];
                int dy=p[1]-q[1];

                int dist=dx*dx+dy*dy;

                map.put(dist,map.getOrDefault(dist,0)+1);
            }

            for(int cnt:map.values())
                ans+=cnt*(cnt-1);
        }

        return ans;
    }
}