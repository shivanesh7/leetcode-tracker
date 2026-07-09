// Last updated: 7/9/2026, 9:46:04 AM
class Solution 
{
    public boolean checkIfPangram(String sentence) 
    {
        
        for(char i='a';i<='z';i++)
        {
            if(sentence.indexOf(i)==-1)
            {
                return false;
            }
        }
        return true;
       
        
            
    }
}