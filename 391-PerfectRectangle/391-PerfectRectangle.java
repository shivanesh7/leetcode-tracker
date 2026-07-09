// Last updated: 7/9/2026, 9:49:26 AM
class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        Set<String> set=new HashSet<>();
        int minX=Integer.MAX_VALUE,minY=Integer.MAX_VALUE;
        int maxX=Integer.MIN_VALUE,maxY=Integer.MIN_VALUE;
        long area=0;

        for(int[] r:rectangles){
            minX=Math.min(minX,r[0]);
            minY=Math.min(minY,r[1]);
            maxX=Math.max(maxX,r[2]);
            maxY=Math.max(maxY,r[3]);

            area+=(long)(r[2]-r[0])*(r[3]-r[1]);

            String[] p={
                r[0]+" "+r[1],
                r[0]+" "+r[3],
                r[2]+" "+r[1],
                r[2]+" "+r[3]
            };

            for(String s:p){
                if(!set.add(s)) set.remove(s);
            }
        }

        if(set.size()!=4) return false;

        if(!set.contains(minX+" "+minY) ||
           !set.contains(minX+" "+maxY) ||
           !set.contains(maxX+" "+minY) ||
           !set.contains(maxX+" "+maxY))
            return false;

        return area==(long)(maxX-minX)*(maxY-minY);
    }
}
