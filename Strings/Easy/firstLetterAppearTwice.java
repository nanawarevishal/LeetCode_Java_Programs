

/*

 2351. First Letter to Appear Twice
        Easy
        892
        48
        Companies
        Given a string s consisting of lowercase English letters, return the first letter to appear twice.

        Note:

        A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
        s will contain at least one letter that appears twice.
        

        Example 1:
        Input: s = "abccbaacz"
        Output: "c"
        Explanation:
        The letter 'a' appears on the indexes 0, 5 and 6.
        The letter 'b' appears on the indexes 1 and 4.
        The letter 'c' appears on the indexes 2, 3 and 7.
        The letter 'z' appears on the index 8.
        The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.


        Example 2:
        Input: s = "abcdd"
        Output: "d"
        Explanation:
        The only letter that appears twice is 'd' so we return 'd'.

 */



package Strings.Easy;

import java.util.HashMap;

public class firstLetterAppearTwice {

    static char repeatedCharacter(String s) {
        
        char ch = 'a';
        HashMap<Character,Integer>hm = new HashMap<>();

        for(int i=0;i<s.length();i++){

            int x = hm.getOrDefault(s.charAt(i),0);

            if(x+1 == 2){
                ch =  s.charAt(i);
                break;
            }

            hm.put(s.charAt(i),x+1);
        }

        return ch;
    }

    public static void main(String[] args) {
        
        String s = "abccbaacz";
        
        System.out.println(repeatedCharacter(s));
    }
}
