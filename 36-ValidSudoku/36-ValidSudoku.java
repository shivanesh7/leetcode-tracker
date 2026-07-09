// Last updated: 7/9/2026, 9:51:47 AM
class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<9;i++)
        {
            for(int j =0;j<9;j++)
            {
                char num = board[i][j];
                if(num!='.')
                {
                    String rowkey = "row"+i+num;
                    String colkey= "col"+j+num;
                    String subbox = "sub"+(i/3)+(j/3)+num;
                    if(!set.add(rowkey)|| !set.add(colkey)||!set.add(subbox))
                    {
                        return false;
                    }
                }
            }
           
        }
         return true;
        
    }
}