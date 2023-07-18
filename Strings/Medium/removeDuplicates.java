
/*

 316. Remove Duplicate Letters
        Medium
        7K
        445
        Companies
        Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
        the smallest in lexicographical order
        among all possible results.

        

        Example 1:
        Input: s = "bcabc"
        Output: "abc"

        Example 2:
        Input: s = "cbacdcbc"
        Output: "acdb"

 */



package Strings.Medium;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class removeDuplicates {

    static String removeDuplicateLetters(String s) {

        Set<Character>hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }

        String str = "";
        Iterator<Character> it = hs.iterator();

        while (it.hasNext()) {
            str+=it.next();
        }

        return str;

    }

    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }
}
