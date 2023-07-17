
/*
 40. Combination Sum II
            Medium
            9K
            228
            Companies
            Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

            Each number in candidates may only be used once in the combination.

            Note: The solution set must not contain duplicate combinations.

            

            Example 1:
            Input: candidates = [10,1,2,7,6,1,5], target = 8
            Output: 
            [
            [1,1,6],
            [1,2,5],
            [1,7],
            [2,6]
            ]

            
            Example 2:
            Input: candidates = [2,5,2,1,2], target = 5
            Output: 
            [
            [1,2,2],
            [5]
            ]
 */


package Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import LinkedList.SinglyLinkedList.Medium.removeNthNodeFromBack;
public class combinationSumII {

    static void findComnination(int ind,int[] arr,int target,List<List<Integer>>ans,List<Integer>ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }

            if(arr[i]>target){
                break;
            }

            ds.add(arr[i]);
            findComnination(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ls = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();

        Arrays.sort(candidates);
        int ind =0;
        findComnination(ind, candidates, target, ls, ds);
        return ls;
    }

    public static void main(String[] args) {
        int[] candidate = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>>ls = new ArrayList<>();
        ls = combinationSum2(candidate, target);
        System.out.println(ls);
    }
    
}

