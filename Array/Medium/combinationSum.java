
/*

 39. Combination Sum
        Medium
        16.6K
        336
        Companies
        Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

        The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
        frequency
        of at least one of the chosen numbers is different.

        The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

        

        Example 1:
        Input: candidates = [2,3,6,7], target = 7
        Output: [[2,2,3],[7]]
        Explanation:
        2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
        7 is a candidate, and 7 = 7.
        These are the only two combinations.


        Example 2:
        Input: candidates = [2,3,5], target = 8
        Output: [[2,2,2,2],[2,3,3],[3,5]]

        Example 3:
        Input: candidates = [2], target = 1
        Output: []

 */



package Array.Medium;

import java.util.ArrayList;
import java.util.List;


public class combinationSum {

    static void findComnination(int ind,int[] arr,int target,List<List<Integer>>ans,List<Integer>ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            } 
            return;
        }

        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findComnination(ind, arr, target-arr[ind], ans, ds);
            ds.remove(ds.size()-1);
        }

        findComnination(ind+1, arr, target, ans, ds);
    }

    static List<List<Integer>> combinationSum1(int[] candidates, int target) {
        List<List<Integer>>ls = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();
        int ind =0;
        findComnination(ind, candidates, target, ls, ds);
        return ls;
    }

    public static void main(String[] args) {
        int[] candidate = {2,3,6,7};
        int target = 7;

        List<List<Integer>>ls = new ArrayList<>();
        ls = combinationSum1(candidate, target);
        System.out.println(ls);
    }
    
}
