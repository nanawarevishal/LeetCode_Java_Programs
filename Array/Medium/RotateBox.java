
/*
 1861. Rotating the Box
        Medium
        916
        50
        Companies
        You are given an m x n matrix of characters box representing a side-view of a box. Each cell of the box is one of the following:

        A stone '#'
        A stationary obstacle '*'
        Empty '.'
        The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.

        It is guaranteed that each stone in box rests on an obstacle, another stone, or the bottom of the box.

        Return an n x m matrix representing the box after the rotation described above.

        

        Example 1:
        Input: box = [["#",".","#"]]
        Output: [["."],
                ["#"],
                ["#"]]


        Example 2:
        Input: box = [["#",".","*","."],
                    ["#","#","*","."]]
        Output: [["#","."],
                ["#","#"],
                ["*","*"],
                [".","."]].



        Example 3:
        Input: box = [["#","#","*",".","*","."],
                    ["#","#","#","*",".","."],
                    ["#","#","#",".","#","."]]
        Output: [[".","#","#"],
                [".","#","#"],
                ["#","#","*"],
                ["#","*","."],
                ["#",".","*"],
                ["#",".","."]]
        

        Constraints:

        m == box.length
        n == box[i].length
        1 <= m, n <= 500
        box[i][j] is either '#', '*', or '.'.
 */


package Array.Medium;


public class RotateBox {
    
    static String[][] rotateTheBox(String[][] box) {
        
        String nums[][] = new String[box[0].length][box.length];

        for(int i=0;i<box.length;i++){

            for(int j=0;j<box[i].length;j++){
                nums[j][i] = box[i][j];
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<nums.length;i++){
            int left = 0;
            int right = nums[0].length-1;

            while(left<right){
                String temp = nums[i][left];
                nums[i][left] = nums[i][right];
                nums[i][right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        String  box[][] = {{"#","#","*",".","*","."},
                    {"#","#","#","*",".","."},
                    {"#","#","#",".","#","."}};

        String ans[][] = rotateTheBox(box);


        for(int i=0;i<ans.length;i++){

            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }

            System.out.println();
        }
                    
    }
}
