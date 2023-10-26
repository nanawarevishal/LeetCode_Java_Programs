
/*

415. Add Strings
        Easy
        4.8K
        697
        Companies
        Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

        You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

        Example 1:
        Input: num1 = "11", num2 = "123"
        Output: "134".

        Example 2:
        Input: num1 = "456", num2 = "77"
        Output: "533".


        Example 3:
        Input: num1 = "0", num2 = "0"
        Output: "0".


 */




package Strings.Easy;

public class AddString {

    static String addStrings(String num1, String num2) {

        if(num1.length()==0 && num2.length()==0){
            return "";
        }
       
       if(num1.length()>num2.length()){
           String temp = num1;
           num1 = num2;
           num2 = temp;
       }

       num1 = new StringBuffer(num1).reverse().toString();
       num2 = new StringBuffer(num2).reverse().toString();

        String str = "";
        int carry = 0;
       for(int i=0;i<num1.length();i++){
           int sum = num1.charAt(i)-48+num2.charAt(i)-48+carry;
           str += sum %10;
           carry = sum/10;
       }

       for(int i=num1.length();i<num2.length();i++){
           int sum = num2.charAt(i)-48+carry;
           str += sum % 10;
           carry = sum /10;
       }

       if(carry>0){

           str +=carry;
       }

       str = new StringBuffer(str).reverse().toString();

       return str;

    }


    public static void main(String[] args) {

        String num1 = "11", num2 = "123";
        System.out.println(addStrings(num1, num2));
    }
}
