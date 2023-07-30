
/*

 560. Subarray Sum Equals K
        Medium
        19.1K
        566
        Companies
        Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

        A subarray is a contiguous non-empty sequence of elements within an array.

        
        Example 1:
        Input: nums = [1,1,1], k = 2
        Output: 2


        Example 2:
        Input: nums = [1,2,3], k = 3
        Output: 2

 */



package Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class subArraySumK {

    static int subarraySum(int[] nums, int k) {
       int count = 0;

       Map<Integer,Integer>mp = new HashMap<>();
       int sum = 0;
       mp.put(0, 1);

       for(int i=0;i<nums.length;i++){
            sum +=nums[i];

            int reqSum = sum - k;

            count +=mp.getOrDefault(reqSum, 0);

            mp.put(sum, mp.getOrDefault(sum, 0)+1);

       }
       return count;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,-3,1,1,1,4,2,-3}, k = 3;

        System.out.println(subarraySum(nums, k));


    }
}
