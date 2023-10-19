

/*

520. Detect Capital
        Easy
        3.3K
        452
        Companies
        We define the usage of capitals in a word to be right when one of the following cases holds:

        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital, like "Google".
        Given a string word, return true if the usage of capitals in it is right.


        Example 1:
        Input: word = "USA"
        Output: true.

        Example 2:
        Input: word = "FlaG"
        Output: false.


 */




package Strings.Easy;

public class DetectCapital {

    static boolean detectCapitalUse(String word) {
        
        boolean isFirstcap = false;
        boolean isMiddlecap = false;
        boolean isMiddlesm = false;

        if(word.charAt(0)>=65 && word.charAt(0)<=90){
            isFirstcap = true;
        }

        for(int i=1;i<word.length();i++){

            if(word.charAt(i)>=65 && word.charAt(i)<=90){
                isMiddlecap = true;
            }

            if(word.charAt(i)>=97 && word.charAt(i)<=122){
                isMiddlesm = true;
            }
        }

        if(!isMiddlecap){
            return true;
        }

        else if(isFirstcap && !isMiddlesm ){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }
}
