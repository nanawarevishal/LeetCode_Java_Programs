

/*

2610. Convert an Array Into a 2D Array With Conditions
        Medium
        449
        12
        Companies
        You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

        The 2D array should contain only the elements of the array nums.
        Each row in the 2D array contains distinct integers.
        The number of rows in the 2D array should be minimal.
        Return the resulting array. If there are multiple answers, return any of them.

        Note that the 2D array can have a different number of elements on each row.

        Example 1:
        Input: nums = [1,3,4,1,2,3,1]
        Output: [[1,3,4,2],[1,3],[1]]
        Explanation: We can create a 2D array that contains the following rows:
        - 1,3,4,2
        - 1,3
        - 1
        All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
        It can be shown that we cannot have less than 3 rows in a valid array.

        Example 2:
        Input: nums = [1,2,3,4]
        Output: [[4,3,2,1]]
        Explanation: All elements of the array are distinct, so we can keep all of them in the first row of the 2D array.


 */



package Array.Medium;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ConvertArrayInto2DArrayList {

    static List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>>ls = new ArrayList<>();
        ArrayList<Integer>lst = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            lst.add(nums[i]);
        }

        System.out.println(lst);

        LinkedHashSet<Integer>hs = new LinkedHashSet<>();
        while(!lst.isEmpty()){

           for(int data : lst){
                if(!hs.contains(data)){
                    hs.add(data);
                }
           }

           for(int data : hs){
                lst.remove(Integer.valueOf(data));

           }

            ls.add(new ArrayList<>(hs));
            hs = new LinkedHashSet<>();

        }

        return ls;
        
    }

    public static void main(String[] args) {

        int nums[] = {1,3,4,1,2,3,1};

        // ArrayList<Integer>ls = new ArrayList<>();
        // ls.add(10);
        // ls.add(2);
        // ls.add(10);

        System.out.println(findMatrix(nums));
    }
}
