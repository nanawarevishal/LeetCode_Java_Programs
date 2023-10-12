
/*

209. Minimum Size Subarray Sum
        Medium
        11.8K
        352
        Companies
        Given an array of positive integers nums and a positive integer target, return the minimal length of a 
        subarray
        whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

        

        Example 1:
        Input: target = 7, nums = [2,3,1,2,4,3]
        Output: 2
        Explanation: The subarray [4,3] has the minimal length under the problem constraint.

        Example 2:
        Input: target = 4, nums = [1,4,4]
        Output: 1.

        Example 3:
        Input: target = 11, nums = [1,1,1,1,1,1,1,1]
        Output: 0.


 */






package Array.Medium;

public class MinimumSumSubArray {

    static int minSubArrayLenBruteForce(int target, int[] nums) {
        
        int len = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){

            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum +=nums[j];

                if(sum>=target){
                    flag = true;
                    len = Math.min(len,j-i+1);
                    break;
                }
            }
        }

        if(!flag){
            return 0;
        }
        return len;

    }

    static int minSubArrayLenOptimal(int target, int[] nums) {
        
        int len = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            while(sum>=target){
                
                flag = true;
                len = Math.min(len,i-left+1);
                sum -=nums[left];
                left++;
            }
        }

        if(!flag){
            return 0;
        }

        return len;
    }


    public static void main(String[] args) {

        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        System.out.println(minSubArrayLenBruteForce(target, nums));

    }
}
