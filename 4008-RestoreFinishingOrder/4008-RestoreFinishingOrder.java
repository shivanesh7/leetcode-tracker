// Last updated: 7/9/2026, 9:45:34 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) 
    {
        int []arr=new int [friends.length];
        int k=0;
        for(int i=0;i<order.length;i++)
        {
            for(int j=0;j<friends.length;j++)
            {
                if(order[i]==friends[j])
                {
                    arr[k]=order[i];
                    k++;
                }
            }
        }
        return arr;
    }
}