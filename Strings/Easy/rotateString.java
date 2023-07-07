

/*
 796. Rotate String
        Easy
        2.9K
        118
        Companies
        Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

        A shift on s consists of moving the leftmost character of s to the rightmost position.

        For example, if s = "abcde", then it will be "bcdea" after one shift.
    
        Example 1:
        Input: s = "abcde", goal = "cdeab"
        Output: true


        Example 2:
        Input: s = "abcde", goal = "abced"
        Output: false

 */




package Strings.Easy;

public class rotateString {

    static boolean rotateStrings(String s, String goal) {

        if(s.length()==0 || goal.length()==0 || s.length()!=goal.length()){
            return false;
        }
        char ch[] = s.toCharArray();

        for(int j=0;j<ch.length;j++){
            char temp = ch[0];
            for(int i=1;i<ch.length;i++){
                ch[i-1] = ch[i];
            }
    
            ch[ch.length-1] = temp;

            String str = new String(ch);

            if(str.equals(goal)){
                return true;
            }
    
            // System.out.println(ch);
        }

        return false;
    }
    public static void main(String[] args) {
        String s = "abcde", goal = "abced";

        System.out.println(rotateStrings(s, goal));;

    }
}
