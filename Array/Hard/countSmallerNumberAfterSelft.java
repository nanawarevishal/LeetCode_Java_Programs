package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class countSmallerNumberAfterSelft {

    static List<Integer> countSmaller(int[] nums) {
        
        int arr[] = new int[nums.length];
        Stack<Integer>st = new Stack<>();
        st.push(0);

        for(int i=nums.length-1;i>=0;i--){

            if(st.peek()<nums[i]){

                arr[i] = st.peek();
            }

            else{

                while(!st.isEmpty() && st.peek()>nums[i]){
                    st.pop();
                } 
                
                arr[i] = st.peek();
            }

            st.push(nums[i]);
        }

        List<Integer>ls = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
                ls.add(arr[i]);
        }

        return ls;
    }

    public static void main(String[] args) {

        int nums[] = {5,2,6,1};

        System.out.println(countSmaller(nums));
    }
        
}
