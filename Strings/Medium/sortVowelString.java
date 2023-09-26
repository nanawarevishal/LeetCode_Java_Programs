
/*
 2785. Sort Vowels in a String
        Medium
        234
        6
        Companies
        Given a 0-indexed string s, permute s to get a new string t such that:

        All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
        The vowels must be sorted in the nondecreasing order of their ASCII values. More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value than t[j].
        Return the resulting string.

        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.

        

        Example 1:
        Input: s = "lEetcOde"
        Output: "lEOtcede"
        Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants. The vowels are sorted according to their ASCII values, and the consonants remain in the same places.

        Example 2:
        Input: s = "lYmpH"
        Output: "lYmpH"
        Explanation: There are no vowels in s (all characters in s are consonants), so we return "lYmpH".

 */




package Strings.Medium;

import java.util.*;

public class sortVowelString {

    static String sortVowels(String s) {

        List<Character>ls=  new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){

            ls.add(s.charAt(i));
            }

        }

        Collections.sort(ls);
    

        String str = "";
        int ind = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                
                str +=ls.get(ind);
                ind++;
            }
            else{
            str+=s.charAt(i);
            }
           
        }
    
        return str;
    }


    public static void main(String[] args) {
        String s = "lEetcOde";

        System.out.println(sortVowels(s));
    }
}
