
/*

 78. Subsets
        Medium
        15.1K
        222
        Companies
        Given an integer array nums of unique elements, return all possible 
        subsets
        (the power set).

        The solution set must not contain duplicate subsets. Return the solution in any order.

        

        Example 1:
        Input: nums = [1,2,3]
        Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

        Example 2:
        Input: nums = [0]
        Output: [[],[0]]


 */
package Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class subsets {

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            List<Integer>subls = new ArrayList<>();
            for(int j=i;j<nums.length;i++){
                
            }
        }

        return ls;
    }
    public static void main(String[] args) {
        
    }
}
