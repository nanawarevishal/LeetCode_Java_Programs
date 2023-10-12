
/*

1590. Make Sum Divisible by P
            Medium
            1.4K
            55
            Companies
            Given an array of positive integers nums, remove the smallest subarray (possibly empty) such that the sum of the remaining elements is divisible by p. It is not allowed to remove the whole array.

            Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.

            A subarray is defined as a contiguous block of elements in the array.

            
            Example 1:
            Input: nums = [3,1,4,2], p = 6
            Output: 1
            Explanation: The sum of the elements in nums is 10, which is not divisible by 6. We can remove the subarray [4], and the sum of the remaining elements is 6, which is divisible by 6.

            Example 2:
            Input: nums = [6,3,5,2], p = 9
            Output: 2
            Explanation: We cannot remove a single element to get a sum divisible by 9. The best way is to remove the subarray [5,2], leaving us with [6,3] with sum 9.

            Example 3:
            Input: nums = [1,2,3], p = 3
            Output: 0
            Explanation: Here the sum is 6. which is already divisible by 3. Thus we do not need to remove anything.

 */




package Array.Medium;

public class MakeSumDivisionbleByP {

    static int minSubarray(int[] nums, int p) {
        
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }

        System.out.println(sum);

        if(sum%p==0){
            return 0;
        }

        
        long req = sum % p;
        System.out.println(req);

        int left = 0;
        int right = 0;
        sum = 0;
        int len = Integer.MAX_VALUE;
        while(right<nums.length){
            sum +=nums[right];

            if(sum>req){

                while(left<=right && sum>req){
                    sum -=nums[left];
                    left++;
                }
            }

            if(sum==req){
                len = Math.min(right-left+1,len);
            }

            System.out.println(len);

            right++;
        }

        if(len==nums.length || len==Integer.MAX_VALUE){
            return -1;
        }

        return len;
    }


    public static void main(String[] args) {
        int[] nums = {26,19,11,14,18,4,7,1,30,23,19,8,10,6,26,3};
        int p = 26;

        System.out.println(minSubarray(nums, p));
    }
}
