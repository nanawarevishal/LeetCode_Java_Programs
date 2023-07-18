

/*


 2710. Remove Trailing Zeros From a String
        Easy
        178
        7
        Companies
        Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.

        

        Example 1:
        Input: num = "51230100"
        Output: "512301"
        Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".


        Example 2:
        Input: num = "123"
        Output: "123"
        Explanation: Integer "123" has no trailing zeros, we return integer "123".


 */



package Strings.Easy;

public class removeTrailingZerosString {

    static String removeTrailingZeros(String num) {
        int ind = -1;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='0'){
                ind = i;
            }

            else{
                break;
            }
        }

        if(ind == -1){
            return num;
        }

        num = num.substring(0, ind);
        return num;
    }
    public static void main(String[] args) {
        String num = "123";

        System.out.println(removeTrailingZeros(num));
    }
}
