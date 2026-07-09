// Last updated: 7/9/2026, 9:49:05 AM
class Solution {
    int m,n;
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m=heights.length;
        n=heights[0].length;

        boolean[][] pac=new boolean[m][n];
        boolean[][] atl=new boolean[m][n];

        for(int i=0;i<m;i++){
            dfs(heights,pac,i,0);
            dfs(heights,atl,i,n-1);
        }

        for(int j=0;j<n;j++){
            dfs(heights,pac,0,j);
            dfs(heights,atl,m-1,j);
        }

        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pac[i][j]&&atl[i][j])
                    ans.add(Arrays.asList(i,j));
            }
        }

        return ans;
    }

    void dfs(int[][] h,boolean[][] vis,int r,int c){
        vis[r][c]=true;

        for(int[] d:dir){
            int nr=r+d[0],nc=c+d[1];

            if(nr<0||nc<0||nr>=m||nc>=n||
               vis[nr][nc]||
               h[nr][nc]<h[r][c]) continue;

            dfs(h,vis,nr,nc);
        }
    }
}