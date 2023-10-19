
/*

2129. Capitalize the Title
        Easy
        666
        47
        Companies
        You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:

        If the length of the word is 1 or 2 letters, change all letters to lowercase.
        Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
        Return the capitalized title.

        

        Example 1:
        Input: title = "capiTalIze tHe titLe"
        Output: "Capitalize The Title"
        Explanation:
        Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.

        Example 2:
        Input: title = "First leTTeR of EACH Word"
        Output: "First Letter of Each Word"
        Explanation:
        The word "of" has length 2, so it is all lowercase.
        The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.

        Example 3:
        Input: title = "i lOve leetcode"
        Output: "i Love Leetcode"
        Explanation:
        The word "i" has length 1, so it is lowercase.
        The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.

 */




package Strings.Easy;

public class CapitalizeTheTitle {

    static String capitalizeTitle(String title) {
        
        String str = "";

        String st[] = title.split(" ");

        for(int i=0;i<st.length;i++){

            if(st[i].length()<=2){
                str = str + (st[i].toLowerCase());
            }

            else{
                
               st[i] = st[i].toLowerCase();

               char ch[] = st[i].toCharArray();

               ch[0] = (char)(ch[0]-32);

               str = str +new String(ch);
            }

            if(i+1<st.length){
                str +=" ";
            }

        }

        return str;
    }


    public static void main(String[] args) {

        String title = "capiTalIze tHe titLe";

        System.out.println(capitalizeTitle(title));
    }
}
