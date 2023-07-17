

/*

 59. Spiral Matrix II
        Medium
        5.8K
        237
        Companies
        Given a positive integer no, generate an no x no matrix filled with elements from 1 to n2 in spiral order.

        

        Example 1:
        Input: no = 3
        Output: [[1,2,3],[8,9,4],[7,6,5]]

        Example 2:
        Input: no = 1
        Output: [[1]]


 */
package Array.Medium;

public class SpiralMatrixII {
    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;
        int no=1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                // ls.add(matrix[top][i]);
                matrix[top][i] = no;
                no++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = no;
                no++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--){
                    matrix[bottom][i] = no;
                    no++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--){
                    matrix[i][left] = no;
                    no++;
                }
                left++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(3);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
