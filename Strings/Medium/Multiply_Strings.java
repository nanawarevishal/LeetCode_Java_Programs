

/*
 43. Multiply Strings
        Medium
        6.2K
        2.8K
        Companies
        Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

        Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

        

        Example 1:
        Input: num1 = "2", num2 = "3"
        Output: "6"

        Example 2:
        Input: num1 = "123", num2 = "456"
        Output: "56088"
 */






package Strings.Medium;
public class Multiply_Strings {

    static String multiply(String num1, String num2) {
        Long a = Long.parseLong(num1) * Long.parseLong(num2);

        return Long.toString(a);
    }
    public static void main(String[] args) {
        String n1 = "123";
        String n2 = "456";

        System.out.println(multiply(n1, n2));

    }
}
