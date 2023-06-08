

/*

 128. Longest Consecutive Sequence
        Medium
        16.3K
        683
        Companies
        Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

        You must write an algorithm that runs in O(n) time.

        

        Example 1:
        Input: nums = [100,4,200,1,3,2]
        Output: 4
        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

        Example 2:
        Input: nums = [0,3,7,2,5,8,4,6,0,1]
        Output: 9

 */






package Array.Medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        Arrays.sort(nums);

        int longseq=1;
        int count=1;
        int prev = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] == prev+1)
                count++;
            
            else if(nums[i]!=prev)
                count=1;

            prev= nums[i];

            longseq = Math.max(longseq,count);

                
        }

        return longseq;
    }
    public static void main(String[] args) {

        int[] nums = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(nums));
        
    }
}
