

/*

 344. Reverse String
        Easy
        7.6K
        1.1K
        Companies
        Write a function that reverses a string. The input string is given as an array of characters s.

        You must do this by modifying the input array in-place with O(1) extra memory.

        

        Example 1:
        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]


       Example 2:
        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]


 */


package Strings.Easy;

public class reverseString {

    static void reverseString1(char[] s) {
        int left =0;
        int right =s.length-1;

        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] =temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString1(s);

        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}