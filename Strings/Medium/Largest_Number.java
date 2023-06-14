

/*
 179. Largest Number
        Medium
        7K
        569
        Companies
        Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

        Since the result may be very large, so you need to return a string instead of an integer.

        
        Example 1:
        Input: nums = [10,2]
        Output: "210"


        Example 2:
        Input: nums = [3,30,34,5,9]
        Output: "9534330"

 */


package Strings.Medium;
import java.util.ArrayList;
import java.util.Collections;

public class Largest_Number {

    static String largestNumber(int[] nums) {
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];

            while(temp!=0){
                int rem = temp % 10;
                arr2.add(rem);
                temp/=10;
            }
        }

        Collections.sort(arr2, Collections.reverseOrder()); 

        int val = 0;
        String str = "";
        while(arr2.size()>val){
            str +=arr2.get(val);
            val++;
        }

        return str;
    }
    public static void main(String[] args) {
        int nums[] = {10,2};

        System.out.println(largestNumber(nums));
    }
}
