

/*
 151. Reverse Words in a String
        Medium
        6.1K
        4.6K
        Companies
        Given an input string s, reverse the order of the words.

        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

        Return a string of the words in reverse order concatenated by a single space.

        Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

        
        Example 1:
        Input: s = "the sky is blue"
        Output: "blue is sky the"

        Example 2:
        Input: s = "  hello world  "
        Output: "world hello"
        Explanation: Your reversed string should not contain leading or trailing spaces.

        Example 3:
        Input: s = "a good   example"
        Output: "example good a"
        Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

 */


package Strings.Medium;

import java.util.Arrays;

public class reverse_words_In_Strings {

    static String reverseWords(String s) {
       
        String str = s.trim();

        String str1[] = str.split(" ");
        String str2[] = new String[str1.length];
        for(int i=str1.length-1;i>=0;i--){
            str2[str1.length-1-i]=str1[i];
        }
    return Arrays.toString(str2);
        // return str3;
    }
    public static void main(String[] args) {
        String str = "a good   example";

        System.out.println(reverseWords(str));

    }
}