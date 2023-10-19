
/*

1935. Maximum Number of Words You Can Type
        Easy
        542
        25
        Companies
        There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

        Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.

        

        Example 1:
        Input: text = "hello world", brokenLetters = "ad"
        Output: 1
        Explanation: We cannot type "world" because the 'd' key is broken.

        Example 2:
        Input: text = "leet code", brokenLetters = "lt"
        Output: 1
        Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.

        Example 3:
        Input: text = "leet code", brokenLetters = "e"
        Output: 0
        Explanation: We cannot type either word because the 'e' key is broken.


 */





package Strings.Easy;

import java.util.HashSet;

public class MaximumWordCanYouType{

    static int canBeTypedWords(String text, String brokenLetters) {
        
        HashSet<Character>hs = new HashSet<>();

        for(int i=0;i<brokenLetters.length();i++){
            hs.add(brokenLetters.charAt(i));
        }

        int x  = text.split(" ").length;
        int count = 0;
        for(int i=0;i<text.length();i++){

            if(brokenLetters.contains(text.charAt(i)+"")){
                count++;
                while(i<text.length() && text.charAt(i)!=' '){
                    i++;
                }
            }
        }

        return x-count;
    }
    
    public static void main(String[] args) {

        String text = "hello world", brokenLetters = "ad";

        System.out.println(canBeTypedWords(text, brokenLetters));
    }
}