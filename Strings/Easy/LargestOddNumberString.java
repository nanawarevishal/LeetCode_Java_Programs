

/*


 1903. Largest Odd Number in String
        Easy
        962
        69
        Companies
        You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

        A substring is a contiguous sequence of characters within a string.

        

        Example 1:

        Input: num = "52"
        Output: "5"
        Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
        Example 2:

        Input: num = "4206"
        Output: ""
        Explanation: There are no odd numbers in "4206".
        Example 3:

        Input: num = "35427"
        Output: "35427"
        Explanation: "35427" is already an odd number.

 */



package Strings.Easy;


public class LargestOddNumberString {

    static String largestOddNumber(String num) {

        int ind =0;
        boolean flag = false;
        for(int i=num.length()-1;i>=0;i--){
            if(Integer.parseInt(String.valueOf(num.charAt(i)))%2!=0){
                flag = true;
                ind = i;
                break;
            }
        }

        String str1 = num.substring(0, ind+1);

        if(!flag){
            return "";
        }

        return str1;
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }
}
