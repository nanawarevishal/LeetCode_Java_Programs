
/*

2864. Maximum Odd Binary Number
        Easy
        86
        0
        Companies
        You are given a binary string s that contains at least one '1'.

        You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.

        Return a string representing the maximum odd binary number that can be created from the given combination.

        Note that the resulting string can have leading zeros.

    
        Example 1:
        Input: s = "010"
        Output: "001"
        Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".

        Example 2:
        Input: s = "0101"
        Output: "1001"
        Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001".


 */




package Strings.Easy;

public class maximumOddBinaryNumber {

    static String maximumOddBinaryNumbers(String s) {
        
        int oneCount = 0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='1'){
                oneCount++;
            }
        }

        oneCount--;

        String str = "";
        if(oneCount==0){
            for(int i=0;i<s.length()-1;i++){
                str +='0';
            }
            str +='1';
        }
        else{

            for(int i=0;i<s.length()-1;i++){

                if(oneCount!=0){
                    str +='1';
                    oneCount--;
                }
                else{
                    str +='0';
                }
            }

            str +='1';
        }

        return str;
    }


    public static void main(String[] args) {
        
        String s = "010";

        System.out.println(maximumOddBinaryNumbers(s));
    }
}
