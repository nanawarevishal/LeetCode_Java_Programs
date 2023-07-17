
/*
 152. Maximum Product Subarray
        Medium
        16.5K
        504
        Companies
        Given an integer array nums, find a 
        subarray
        that has the largest product, and return the product.

        The test cases are generated so that the answer will fit in a 32-bit integer.

        

        Example 1:
        Input: nums = [2,3,-2,4]
        Output: 6
        Explanation: [2,3] has the largest product 6.

        Example 2:
        Input: nums = [-2,0,-1]
        Output: 0
        Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

 */


package Array.Medium;

public class MaximumProductSubarray {

    static int maxProduct(int[] nums) {
        int prod;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            prod =1;
            for(int j=i;j<nums.length;j++){
                prod = prod*nums[j];
                max = Math.max(max, prod);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {-2,0,-1};
        System.out.println(maxProduct(nums));
    }
}
