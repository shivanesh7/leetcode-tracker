// Last updated: 7/9/2026, 9:48:07 AM
class Solution 
{
    public int minSwapsCouples(int[] row)
    {
        int n =row.length;

        HashMap<Integer,Integer> position = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            position.put(row[i],i);
        }

        int swap=0;
        for(int i=0;i<n;i+=2)
        {
            int first = row[i];
            int partner =first ^ 1;

            if(row[i+1]!=partner)
            {
                swap++;
            } 
            int partnerIndex = position.get(partner);

            int temp = row[i+1];
            row[i+1]=row[partnerIndex];
            row[partnerIndex] =temp;

            position.put(temp,partnerIndex);
            position.put(partner,i+1);
        }
        return swap;
        
        
    }
}