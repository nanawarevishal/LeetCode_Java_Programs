
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

    static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>>ls = new ArrayList<>();
        ls.add(new ArrayList<>());
        List<Integer>ls1 = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            
            int left = i;
            int right = i;
            while(right<nums.length){
                List<Integer>al =new  ArrayList<>();

                if(left<right){
                    al.add(nums[left]);
                    al.add(nums[right]);
                }

                else{
                    al.add(nums[right]);
                }
                right++;
                ls.add(al);
            }
            ls1.add(nums[i]);
        }
        // System.out.println(ls);
        if(nums.length>1){

            ls.add(ls1);
        }

        return ls;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4,1};

        System.out.println(subset(nums));
    }
}
