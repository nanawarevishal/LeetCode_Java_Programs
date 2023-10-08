

/*

67. Add Binary
        Easy
        8.8K
        875
        Companies
        Given two binary strings a and b, return their sum as a binary string.

        Example 1:
        Input: a = "11", b = "1"
        Output: "100".

        Example 2:
        Input: a = "1010", b = "1011"
        Output: "10101".


 */


package Array.Easy;


public class AddBinary {

    static String addBinary(String a, String b) {

        if(a.equals("0") && b.equals("0")){
            return "0";
        }
        
        long num1= 0;
        for(int i=0;i<a.length();i++){

            if(a.charAt(i)=='1'){
                num1 +=Math.pow(2,a.length()-i-1);
            }
        }

        long num2= 0;
        for(int i=0;i<b.length();i++){

            if(b.charAt(i)=='1'){
                num2 +=Math.pow(2,b.length()-i-1);
            }
        }

        String str1 = num1+"";
        String str2 = num2+"";

        if(str1.length()>str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        str1 = new StringBuffer(str1).reverse().toString();
        str2 = new StringBuffer(str2).reverse().toString();

        String str = "";
        int carry = 0;
        
        for(int i=0;i<str1.length();i++){
            int sum = (int)(str1.charAt(i)-48+str2.charAt(i)-48+carry);
            str +=sum%10;
            carry = sum/10;
        }


        for(int i=str1.length();i<str2.length();i++){
            int sum = str2.charAt(i)-48+carry;
            str +=sum%10;
            carry = sum /10;
        }

        if(carry>0){
            str +=carry;
        }

        str = new StringBuffer(str).reverse().toString();

        // System.out.println(str);

        long num = Long.parseLong(str);

        String st = "";
        while(num!=0){
            st +=(num%2);
            num /=2;
        }

        st  = new StringBuffer(st).reverse().toString();

        // System.out.println(st);

        return st;
    }

    static String addBinaryOptimal(String a, String b) {

        if(a.length()>b.length()){
            String temp  = a;
            a = b;
            b = temp;
        }
        
        String str1 = new StringBuffer(a).reverse().toString();
        String str2 = new StringBuffer(b).reverse().toString();

        String str = "";
        int carry = 0;
        for(int i=0;i<str1.length();i++){
            int sum = str1.charAt(i)-48+str2.charAt(i)-48+carry;

            if(sum==0){
                str +=0;
                carry = 0;
            }
            else if(sum==1){
                str +=1;
                carry = 0;
            }

            else if(sum==2){
                str+=0;
                carry  =1;
            }
            else{
                str +=1;
                carry = 1;
            }
        }

        for(int i=str1.length();i<str2.length();i++){

            int sum = str2.charAt(i)-48+carry;
             if(sum==0){
                str +=0;
                carry = 0;
            }
            else if(sum==1){
                str +=1;
                carry = 0;
            }

            else if(sum==2){
                str+=0;
                carry  =1;
            }
            else{
                str +=1;
                carry = 1;
            }
        }

        if(carry>0){
            str +=carry;
        }

        str = new StringBuffer(str).reverse().toString();

        System.out.println(str);
    
       return str;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        System.out.println(addBinaryOptimal(a, b));
    }
}
