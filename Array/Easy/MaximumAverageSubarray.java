

/*

643. Maximum Average Subarray I
        Easy
        3.1K
        252
        Companies
        You are given an integer array nums consisting of n elements, and an integer k.

        Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

        

        Example 1:
        Input: nums = [1,12,-5,-6,50,3], k = 4
        Output: 12.75000
        Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75.

        Example 2:
        Input: nums = [5], k = 1
        Output: 5.00000.


 */




package Array.Easy;

public class MaximumAverageSubarray{

    static double findMaxAverage(int[] nums, int k) {
        
        double avg = (double)Integer.MIN_VALUE;
        int start = 0;
        int end = k-1;

        while(end<nums.length){

            int sum = 0;
            for(int i=start;i<=end;i++){
                sum += nums[i];
                
            }

            double average = (double)sum/k;

            if(average>avg){
                
                avg = average;
            }
            start++;
            end++;
        }

        return avg;
    }

    public static void main(String[] args) {

        int []nums = {1,0,1,4,2};
        int k = 4;

        System.out.println(findMaxAverage(nums, k));
    }
}