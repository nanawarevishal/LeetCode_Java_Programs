

/*

2404. Most Frequent Even Element
        Easy
        835
        30
        Companies
        Given an integer array nums, return the most frequent even element.

        If there is a tie, return the smallest one. If there is no such element, return -1.

        

        Example 1:
        Input: nums = [0,1,2,2,4,4,1]
        Output: 2
        Explanation:
        The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
        We return the smallest one, which is 2.

        Example 2:
        Input: nums = [4,4,4,9,2,4]
        Output: 4
        Explanation: 4 is the even element appears the most.

        Example 3:
        Input: nums = [29,47,21,41,13,37,25,7]
        Output: -1
        Explanation: There is no even element.

 */


package Array.Easy;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    static int mostFrequentEven(int[] nums) {
        
        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        int element = Integer.MAX_VALUE;
        int count = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer>entry : hm.entrySet()){

            if(entry.getKey()%2==0 && count < entry.getValue()){
                element = entry.getKey();
                count = entry.getValue();

            }

            else if(entry.getKey()%2==0 && count <= entry.getValue()){
                element = Math.min(element,entry.getKey());
                count = entry.getValue();
            }
        }

        if(element == Integer.MAX_VALUE){
            return -1;
        }
        return element;

    }

    public static void main(String[] args) {

        int nums[] = {29,47,21,41,13,37,25,7};

        System.out.println(mostFrequentEven(nums));
    }

}
