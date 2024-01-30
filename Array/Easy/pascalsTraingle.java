
/*
 119. Pascal's Triangle I
        Solved
        Easy
        Topics
        Companies
        Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

        Example 1:

        Input: rowIndex = 3
        Output: [1,3,3,1]
        Example 2:

        Input: rowIndex = 0
        Output: [1]
        Example 3:

        Input: rowIndex = 1
        Output: [1,1]
 */





package Array.Easy;

import java.util.ArrayList;
import java.util.List;

class pascalsTraingle {
    static List<List<Integer>> generate(int numRows) {
    
        List<List<Integer>>ls = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>subls = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==0){
                    subls.add(1);
                }

                else if(j==0 || j == i){
                    subls.add(1);
                }

                else{
                    
                    int x = ls.get(i-1).get(j-1);
      

                    int y = ls.get(i-1).get(j);
                    
                  
                    subls.add(x+y);
                }
            }

            
            ls.add(subls);
            
        }

        return ls;
    }

    public static void main(String[] args) {
        
        List<List<Integer>>ls = generate(5);

        System.out.println(ls);
    }
}
