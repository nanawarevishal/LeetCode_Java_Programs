

/*

1512. Number of Good Pairs
        Easy
        4.9K
        213
        Companies
        Given an array of integers nums, return the number of good pairs.

        A pair (i, j) is called good if nums[i] == nums[j] and i < j.

        

        Example 1:
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

        Example 2:
        Input: nums = [1,1,1,1]
        Output: 6
        Explanation: Each pair in the array are good.

        Example 3:
        Input: nums = [1,2,3]
        Output: 0.


 */



package Array.Easy;

import java.util.HashMap;

public class NumberOfGoodPairs {

    static int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer,Integer>hm = new HashMap<>();

        int count = 0;
        for(int i=0;i<nums.length;i++){

            if(hm.containsKey(nums[i])){
                count +=hm.get(nums[i]);
            }

            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        return count;
    }

    
    public static void main(String[] args) {

        int nums[] = {1,2,3,1,1,3};

        System.out.println(numIdenticalPairs(nums));
    }
}
