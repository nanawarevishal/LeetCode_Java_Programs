

/*

 392. Is Subsequence
        Easy
        7.8K
        434
        Companies
        Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

        A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

        

        Example 1:
        Input: s = "abc", t = "ahbgdc"
        Output: true

        Example 2:
        Input: s = "axc", t = "ahbgdc"
        Output: false

 */


package Strings.Easy;

public class isSubsequence {

    static boolean isSubsequence1(String s, String t) {
        int left1 = 0;
        int left2 = 0;

        if(s.equals("")){
            return true;
        }

        if(s.length()==0){
            return false;
        }

        while(left2<t.length()){

            if(left1>=s.length()){
                break;
            }
            if(s.charAt(left1)==t.charAt(left2)){
                left1++;
                left2++;
            }

            else{
                left2++;
            }
        }
        if(left1==s.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "b", t = "abc";
        System.out.println(isSubsequence1(s, t));
    }
}
