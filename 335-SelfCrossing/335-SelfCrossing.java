// Last updated: 7/9/2026, 9:49:47 AM
class Solution {
    public boolean isSelfCrossing(int[] d) {
        for(int i=3;i<d.length;i++){
            if(d[i]>=d[i-2]&&d[i-1]<=d[i-3])
                return true;

            if(i>=4&&d[i-1]==d[i-3]&&d[i]+d[i-4]>=d[i-2])
                return true;

            if(i>=5&&d[i-2]>=d[i-4]&&
               d[i]+d[i-4]>=d[i-2]&&
               d[i-1]<=d[i-3]&&
               d[i-1]+d[i-5]>=d[i-3])
                return true;
        }
        return false;
    }
}