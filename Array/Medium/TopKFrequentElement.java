package Array.Medium;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {

    static int[] topKFrequent(int[] nums, int k) {

        int arr[] = new int[k];
        
        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>>ls = new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());

        Collections.sort(ls,new Comparator<Map.Entry<Integer,Integer>>(){

            public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
                return -(m1.getValue().compareTo(m2.getValue()));
            }
        });

        int i=0;
        for(Map.Entry<Integer,Integer>entry : ls){
            arr[i] = entry.getKey();
            i++;

            if(i==k){
                break;
            }
        }
        

        return arr;
    }

    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3};
        int k = 2;

        int []arr = topKFrequent(nums, k);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
