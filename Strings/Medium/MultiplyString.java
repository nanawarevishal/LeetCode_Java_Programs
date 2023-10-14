
/*

43. Multiply Strings
        Medium
        6.7K
        3.1K
        Companies
        Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

        Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

        

        Example 1:
        Input: num1 = "2", num2 = "3"
        Output: "6".

        Example 2:
        Input: num1 = "123", num2 = "456"
        Output: "56088".


 */


package Strings.Medium;

public class MultiplyString {

    static String multiply(String num1, String num2) {

        if(num2.equals("0") || num1.equals("0")){
            return "0";
        }


        num1 = new StringBuffer(num1).reverse().toString();
        num2 = new StringBuffer(num2).reverse().toString();

        String str1 = "";
        long zeroCnt = 0;
        for(int i=0;i<num2.length();i++){
            
            String str = "";
            long carry = 0;
            for(int j=0;j<num1.length();j++){

                long sum1  = ((num2.charAt(i)-48) * (num1.charAt(j)-48))+carry; 
                str +=sum1%10;
                carry = sum1/10;
            }

            if(carry>0){
                str +=carry;
            }

            for(int z=0;z<zeroCnt;z++){
                str  = "0"+str;
            }

            zeroCnt++;

            // System.out.println(str);

            if(str.length()>str1.length()){
                String temp = str;
                str = str1;
                str1 = temp;
            }

            // System.out.println(str1);
            // System.out.println(str);

            String st = "";
            int c = 0;
            for(int k = 0;k<str.length();k++){
                int s = str.charAt(k)-48+str1.charAt(k)-48+c;
                st +=s%10;
                c = s/10;
            }

            // System.out.println(str1);

            for(int p=str.length();p<str1.length();p++){
                int s = str1.charAt(p)-48+c;
                // System.out.println(s);
                st +=s%10;
                c = s/10;
            }

            
            if(c>0){
                st +=c;
            }

            str1 = st;
            // break;
        }

       return new StringBuffer(str1).reverse().toString();
    }

    public static void main(String[] args) {

        String num1 = "123", num2 = "456";

        System.out.println(multiply(num1, num2));
    }
    
}
