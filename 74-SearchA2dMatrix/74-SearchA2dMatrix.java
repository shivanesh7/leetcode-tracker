// Last updated: 7/9/2026, 9:51:26 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
        
    }
}