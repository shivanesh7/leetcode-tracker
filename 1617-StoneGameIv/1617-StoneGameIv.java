// Last updated: 8/17/2026, 2:48:23 PM
class Solution {
    boolean seen []= new boolean[100001];
    public boolean winnerSquareGame(int n) 
    {
        if(n==0)return false;
        if(seen[n])return seen[n];
        for(int i=1;i*i<=n;i++)
        {
            if(!winnerSquareGame(n-i*i))
            {
                return seen[n]=true;
            }
        }
        return seen[n]=false;
        
    }
}