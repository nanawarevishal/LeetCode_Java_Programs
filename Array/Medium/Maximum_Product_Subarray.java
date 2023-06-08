

/*
 152. Maximum Product Subarray
        Medium
        16.1K
        492
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

public class Maximum_Product_Subarray {

    static int bruteForce(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product = 1;

                for(int k=i;k<=j;k++){
                    product = product * nums[k];
                }
                maxProd = Math.max(maxProd, product);
            }
       }
       return maxProd;
        
    }

    public static void main(String[] args) {
        int[] nums = {1,2,-3,0,-4,-5};
        System.out.println(bruteForce(nums));
    }
}
