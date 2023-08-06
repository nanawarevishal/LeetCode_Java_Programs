
/*
2108. Find First Palindromic String in the Array
        Easy
        869
        29
        Companies
        Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

        A string is palindromic if it reads the same forward and backward.

        

        Example 1:
        Input: words = ["abc","car","ada","racecar","cool"]
        Output: "ada"
        Explanation: The first string that is palindromic is "ada".
        Note that "racecar" is also palindromic, but it is not the first.


        Example 2:
        Input: words = ["notapalindrome","racecar"]
        Output: "racecar"
        Explanation: The first and only string that is palindromic is "racecar".

        Example 3:
        Input: words = ["def","ghi"]
        Output: ""
        Explanation: There are no palindromic strings, so the empty string is returned.


 */




package Strings.Easy;

public class firstPalindromicString {

    static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String str = words[i];
            if(isPalindromic(str)){
                return str;
            }
        }
        return "";
    }

    static boolean isPalindromic(String str){
        int left=0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};

        System.out.println(firstPalindrome(words));
    }
}
