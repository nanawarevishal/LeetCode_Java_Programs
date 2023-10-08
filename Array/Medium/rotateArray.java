
/*

 189. Rotate Array
        Medium
        15.9K
        1.7K
        Companies
        Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

        

        Example 1:
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]


        Example 2:
        Input: nums = [-1,-100,3,99], k = 2
        Output: [3,99,-1,-100]
        Explanation: 
        rotate 1 steps to the right: [99,-1,-100,3]
        rotate 2 steps to the right: [3,99,-1,-100]


 */




package Array.Medium;

public class rotateArray {

    static void rotate(int[] nums, int k) {

        if(nums.length==1 || k==0){
            return;
        }
        k = k%nums.length;
        int temp[] = new int[nums.length-k];

        for(int i=0;i<nums.length-k;i++){
            temp[i] = nums[i];
        }

        for(int i=nums.length-k;i<nums.length;i++){
            nums[i-(nums.length-k)] = nums[i];
        }

        int x =0;
        for(int i=k;i<nums.length;i++){
            nums[i] = temp[x];
            x++;
        }
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7}, k = 3;

        rotate(nums, k);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
