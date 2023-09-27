

/*
 917. Reverse Only Letters
        Easy
        2.1K
        66
        Companies
        Given a string s, reverse the string according to the following rules:

        All the characters that are not English letters remain in the same position.
        All the English letters (lowercase or uppercase) should be reversed.
        Return s after reversing it.

        

        Example 1:
        Input: s = "ab-cd"
        Output: "dc-ba"

        Example 2:
        Input: s = "a-bC-dEf-ghIj"
        Output: "j-Ih-gfE-dCba"


        Example 3:
        Input: s = "Test1ng-Leet=code-Q!"
        Output: "Qedo1ct-eeLg=ntse-T!"
        
 */



package Strings.Easy;


import java.util.LinkedList;

public class reverseOnlyLetters {

    static String reverseOnlyLetters1(String s) {
        LinkedList<Character>ls = new LinkedList<Character>();

        for(int i=s.length()-1;i>=0;i--){

            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122))
                ls.add(s.charAt(i));
        }

        System.out.println(ls);
        
        String str = "";
        int x= 0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){
                str +=ls.get(x);
                x++;
            }
            else{
                str +=s.charAt(i);
            }
        }

        return str;
        
    }


    public static void main(String[] args) {
        String s = "ab-cd";

        System.out.println(reverseOnlyLetters1(s));
    }
}
