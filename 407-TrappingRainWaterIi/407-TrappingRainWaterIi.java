// Last updated: 7/9/2026, 9:49:12 AM
class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m=heightMap.length,n=heightMap[0].length;
        boolean[][] vis=new boolean[m][n];

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[2]-b[2]);

        for(int i=0;i<m;i++){
            pq.offer(new int[]{i,0,heightMap[i][0]});
            pq.offer(new int[]{i,n-1,heightMap[i][n-1]});
            vis[i][0]=vis[i][n-1]=true;
        }

        for(int j=1;j<n-1;j++){
            pq.offer(new int[]{0,j,heightMap[0][j]});
            pq.offer(new int[]{m-1,j,heightMap[m-1][j]});
            vis[0][j]=vis[m-1][j]=true;
        }

        int ans=0;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};

        while(!pq.isEmpty()){
            int[] cur=pq.poll();

            for(int[] d:dir){
                int x=cur[0]+d[0];
                int y=cur[1]+d[1];

                if(x<0||y<0||x>=m||y>=n||vis[x][y]) continue;

                vis[x][y]=true;
                ans+=Math.max(0,cur[2]-heightMap[x][y]);

                pq.offer(new int[]{
                    x,y,
                    Math.max(cur[2],heightMap[x][y])
                });
            }
        }

        return ans;
    }
}