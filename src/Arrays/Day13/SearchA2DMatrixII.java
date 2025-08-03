package Arrays.Day13;

/*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

 */


public class SearchA2DMatrixII {

    public static void main(String args[])
    {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
         int target = 5;
         System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = 0;
        int cols = matrix[0].length-1;

        while(rows<=matrix.length-1 && cols>=0)
        {
            if(matrix[rows][cols]==target)
                return true;
            else if(matrix[rows][cols]<target)
            {
                rows++;

            }
            else
            {
                cols--;

            }
        }
        return false;
    }
}
