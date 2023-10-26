

/*

989. Add to Array-Form of Integer
        Easy
        3.3K
        267
        Companies
        The array-form of an integer num is an array representing its digits in left to right order.

        For example, for num = 1321, the array form is [1,3,2,1].
        Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

        

        Example 1:
        Input: num = [1,2,0,0], k = 34
        Output: [1,2,3,4]
        Explanation: 1200 + 34 = 1234.

        Example 2:
        Input: num = [2,7,4], k = 181
        Output: [4,5,5]
        Explanation: 274 + 181 = 455.

        Example 3:
        Input: num = [2,1,5], k = 806
        Output: [1,0,2,1]
        Explanation: 215 + 806 = 1021.


 */


package Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class AddtoArrayFormInteger {

    static List<Integer> addToArrayForm(int[] num, int k) {
        
        String s1 = "";
        String s2 = k+"";

        List<Integer>ls = new ArrayList<>();

        for(int i=0;i<num.length;i++){
            s1 +=num[i];
        }

        if(s1.length()>s2.length()){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        s1 = new StringBuffer(s1).reverse().toString();
        s2 = new StringBuffer(s2).reverse().toString();

        String str = "";
        int carry = 0;

        for(int i=0;i<s1.length();i++){
            int sum = s1.charAt(i)-48+s2.charAt(i)-48+carry;
            str += sum % 10;
            carry = sum / 10;

        }

        for(int i=s1.length();i<s2.length();i++){
            int sum = s2.charAt(i)-48 + carry;
            str += sum % 10;
            carry = sum / 10;
        }

        if(carry>0){
            str += carry;
        }

        for(int i=str.length()-1;i>=0;i--){
            ls.add(str.charAt(i)-48);
        }

        return ls;
    }

    public static void main(String[] args) {
        int num[] = {1,2,0,0};
         int k = 34;

        List<Integer>ls= addToArrayForm(num, k);

        System.out.println(ls);
    }
}
