

/*

974. Subarray Sums Divisible by K
        Medium
        6.3K
        263
        Companies
        Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

        A subarray is a contiguous part of an array.

        Example 1:
        Input: nums = [4,5,0,-2,-3,1], k = 5
        Output: 7
        Explanation: There are 7 subarrays with a sum divisible by k = 5:
        [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3].

        Example 2:
        Input: nums = [5], k = 9
        Output: 0.

 */

package Array.Medium;

import java.util.HashMap;

public class SubarraySumDivisibleByK {

    static int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer,Integer>hm = new HashMap<>();
        int sum = 0;
        int count = 0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){

            sum +=nums[i];

            int rem = sum % k;

            if(rem<0){
                rem +=k;
            }

            if(hm.containsKey(rem)){
                int x = hm.get(rem);
                count = count+x;
                hm.put(rem,x+1);
            }

            else{
                hm.put(rem,1);
            }
            
        }

        return count;
    }

    public static void main(String[] args) {
        
        int nums[] = {4,5,0,-2,-3,1}, k = 5;

        System.out.println(subarraysDivByK(nums, k));
    }
}
