

/*

 442. Find All Duplicates in an Array
        Medium
        9.3K
        326
        Companies
        Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

        You must write an algorithm that runs in O(n) time and uses only constant extra space.

        

        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [2,3].


        Example 2:
        Input: nums = [1,1,2]
        Output: [1].

        Example 3:
        Input: nums = [1]
        Output: [].

 */






package Array.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateInArray {

    static List<Integer> findDuplicates(int[] nums) {
        
        HashSet<Integer>hs = new HashSet<>();
        List<Integer>ls = new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(hs.contains(nums[i])){
                ls.add(nums[i]);
            }
            else{
                hs.add(nums[i]);
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(nums));
    }
}
