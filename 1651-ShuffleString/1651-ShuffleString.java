// Last updated: 7/9/2026, 9:46:19 AM
class Solution {
    public String restoreString(String s, int[] indices) 
    {
        String result="";
        for(int i=0;i<indices.length;i++)
        {
            int index=0;
            for(int j=0;j<indices.length;j++)
            {
                if(i==indices[j])
                {
                    index=j;
                    break;
                }
                
            }
            result+=s.charAt(index);
        }
        return result;
        
    }
}