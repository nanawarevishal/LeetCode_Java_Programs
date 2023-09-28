
/*

 1796. Second Largest Digit in a String
        Easy
        478
        121
        Companies
        Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

        An alphanumeric string is a string consisting of lowercase English letters and digits.

        Example 1:
        Input: s = "dfa12321afd"
        Output: 2
        Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.

        Example 2:
        Input: s = "abc1111"
        Output: -1
        Explanation: The digits that appear in s are [1]. There is no second largest digit.


 */




package Strings.Easy;

public class secondLargestDigitString {

    static int secondHighest(String s) {
        
        int max = -1;
        int secMax = -1;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)>=48 && s.charAt(i)<=57){

                if(max < Integer.parseInt(s.charAt(i)+"")){
                    secMax = max;
                    max = Integer.parseInt(s.charAt(i)+"");
                }
                else if(secMax < Integer.parseInt(s.charAt(i)+"") && max != Integer.parseInt(s.charAt(i)+"")){
                    secMax = Integer.parseInt(s.charAt(i)+"");
                }
            }
        }

        return secMax;
    }


    public static void main(String[] args) {

        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
    }
}
