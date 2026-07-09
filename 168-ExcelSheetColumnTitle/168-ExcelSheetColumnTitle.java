// Last updated: 7/9/2026, 9:50:44 AM
class Solution 
{
    public String convertToTitle(int columnNumber) 
    {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0)
        {
            columnNumber--;
            int remainder = columnNumber%26;
            sb.append((char)('A'+remainder));
            columnNumber/=26;
        }
        return sb.reverse().toString();
    }
}