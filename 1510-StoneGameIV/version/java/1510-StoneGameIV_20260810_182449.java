// Last updated: 8/10/2026, 6:24:49 PM
1class Solution {
2    boolean seen []= new boolean[100001];
3    public boolean winnerSquareGame(int n) 
4    {
5        if(n==0)return false;
6        if(seen[n])return seen[n];
7        for(int i=1;i*i<=n;i++)
8        {
9            if(!winnerSquareGame(n-i*i))
10            {
11                return seen[n]=true;
12            }
13        }
14        return seen[n]=false;
15        
16    }
17}