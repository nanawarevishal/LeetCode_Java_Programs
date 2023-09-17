
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
        List<Integer>al =new  ArrayList<>();
        ls.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            List<Integer>subls = new ArrayList<>();
            subls.add(nums[i]);
            ls.add(new ArrayList<>(subls));
            for(int j=i+1;j<nums.length;j++){
                subls.add(nums[j]);
                
                ls.add(new ArrayList<>(subls));
                subls.remove(1);
            }
            al.add(nums[i]);
        }

        if(nums.length==1 || nums.length==2){
            return ls;
        }

        ls.add(al);

        return ls;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(subsets(nums));
    }
}
