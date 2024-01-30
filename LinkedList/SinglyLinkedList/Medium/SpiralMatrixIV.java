
/*
 2326. Spiral Matrix IV
        Medium
        694
        26
        Companies
        You are given two integers m and n, which represent the dimensions of a matrix.

        You are also given the head of a linked list of integers.

        Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the top-left of the matrix. If there are remaining empty spaces, fill them with -1.

        Return the generated matrix.

        

        Example 1:
        Input: m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
        Output: [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
        Explanation: The diagram above shows how the values are printed in the matrix.
        Note that the remaining spaces in the matrix are filled with -1.


        Example 2:
        Input: m = 1, n = 4, head = [0,1,2]
        Output: [[0,1,2,-1]]
        Explanation: The diagram above shows how the values are printed from left to right in the matrix.
        The last space in the matrix is set to -1.


 */




package LinkedList.SinglyLinkedList.Medium;

class SpiralMatrixIV {

    static int[][] spiralMatrix(int m, int n, ListNode head) {
        
        ListNode temp = head;
        int left =0,right = n-1,top=0,bottom = m-1;
        int a[][] = new int[m][n];

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                if(temp!=null){
                    a[top][i] = temp.val;
                    temp = temp.next;
                }
                else{
                    a[top][i] = -1;
                } 
            }
            top++;

            for(int i=top;i<=bottom;i++){
                if(temp!=null){
                    a[i][right] = temp.val;
                    temp = temp.next;
                }

                else{
                    a[i][right] = -1;
                }
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    if(temp!=null){
                        a[bottom][i] = temp.val;
                        temp = temp.next;
                    }
                    else{
                        a[bottom][i] = -1;
                    }
                }

                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    if(temp!=null){
                        a[i][left] = temp.val;
                        temp = temp.next;
                    }
                    else{
                        a[i][left] = -1;
                    }
                }

                left++;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        
    }
}
