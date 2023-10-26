
/*
 229. Majority Element II
        Medium
        9.1K
        388
        Companies
        Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

        

        Example 1:
        Input: nums = [3,2,3]
        Output: [3].

        Example 2:
        Input: nums = [1]
        Output: [1].

        Example 3:
        Input: nums = [1,2]
        Output: [1,2]

 */




package Array.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MajorityElementIII {

    static List<Integer> majorityElement(int[] nums) {
        
        HashSet<Integer>hs = new HashSet<>();
        HashMap<Integer,Integer>hm = new HashMap<>();
        int c = nums.length/3;
        for(int i=0;i<nums.length;i++){

            int x = hm.getOrDefault(nums[i],0);

            if(x+1>c){
                hs.add(nums[i]);
            }

            hm.put(nums[i],x+1);
        } 

        return new ArrayList<>(hs);  
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};

        List<Integer> ls= majorityElement(nums);

        System.out.println(ls);
    }
}
