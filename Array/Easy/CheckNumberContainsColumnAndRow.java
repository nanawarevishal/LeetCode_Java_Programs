

/*
 2133. Check if Every Row and Column Contains All Numbers
        Easy
        909
        48
        Companies
        An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).

        Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

        

        Example 1:
        Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
        Output: true
        Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
        Hence, we return true.

        Example 2:
        Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
        Output: false
        Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
        Hence, we return false.


 */


package Array.Easy;

import java.util.HashSet;

public class CheckNumberContainsColumnAndRow{

    static boolean checkValid(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            HashSet<Integer>hs1 = new HashSet<>();
            HashSet<Integer>hs2 = new HashSet<>();
            for(int j=0;j<matrix[i].length;j++){

                if(matrix[i][j]>matrix.length || hs1.contains(matrix[i][j])){
                    return false;
                }

                else{
                    hs1.add(matrix[i][j]);
                }

                if(matrix[j][i]>matrix.length || hs2.contains(matrix[j][i])){
                    return false;
                }

                else{
                    hs2.add(matrix[j][i]);
                }
    
            }
        }

        return true;
    }


    public static void main(String[] args) {

        int[][]  matrix = {{1,2,3},{3,1,2},{2,3,1}};
        System.out.println(checkValid(matrix));
        
    }
}