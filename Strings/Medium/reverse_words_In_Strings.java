
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

import java.util.Stack;

public class reverse_words_In_Strings {

    static String reverseWordsBruteForce(String s) {
        s += " ";
        s = s.replaceAll("\s+", " ");
        s = s.replaceAll("\\s+$", "");
        s = s.replaceAll("^\\s+", "");
        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                st.push(str);
                str = "";
                
            } else {
                str += s.charAt(i);

            }
        }
        String ans = "";
        while (st.size() != 1) {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek();

        return ans;
    }


    static String reverseWordsBetter(String s){

        if(s.length()==0){
            return s;
        }

        s = s.replaceAll("\s+", " ");
        s = s.replaceAll("\\s+$", "");
        s = s.replaceAll("^\\s+", "");
        String str[] = s.split("\\s");

        Stack<String>st = new Stack<>();
        for(int i=0;i<str.length;i++){
            st.push(str[i]);
        }

        String str2 ="";
        while(st.size()!=1){
            str2  += st.peek()+" ";
            st.pop();
        }

        str2 +=st.peek();
        return str2;
    }

  


    public static void main(String[] args) {
        String str = "  hello world  ";

        // System.out.println(reverseWords(str));

        System.out.println(reverseWordsBetter(str));

    }
}