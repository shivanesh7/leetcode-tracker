// Last updated: 7/9/2026, 9:51:38 AM
class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> result = new ArrayList<>();
        int rowLower = 0;
        int rowUpper = matrix.length-1;
        int colLower = 0;
        int colUpper =matrix[0].length-1;

        while(rowLower<=rowUpper && colLower<=colUpper)
        {
            //left to right
            for(int i =colLower;i<=colUpper;i++)
            {
                result.add(matrix[rowLower][i]);
            }
            rowLower++;
            //top to bottom
            for(int i =rowLower;i<=rowUpper;i++)
            {
                result.add(matrix[i][colUpper]);
            }
            colUpper--;
            if(rowLower>rowUpper || colLower>colUpper)
            break;
            //left to right
            for(int i =colUpper;i>=colLower;i--)
            {
                result.add(matrix[rowUpper][i]);
            }
            rowUpper--;
            //top to bottom
            for(int i = rowUpper;i>=rowLower;i--)
            {
                result.add(matrix[i][colLower]);
            }
            colLower++;
        }
        return result;


        
    }
}