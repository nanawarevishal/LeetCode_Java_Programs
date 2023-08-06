
/*
 438. Find All Anagrams in a String
        Medium
        11.6K
        318
        Companies
        Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

        

        Example 1:
        Input: s = "cbaebabacd", p = "abc"
        Output: [0,6]
        Explanation:
        The substring with start index = 0 is "cba", which is an anagram of "abc".
        The substring with start index = 6 is "bac", which is an anagram of "abc".

        Example 2:
        Input: s = "abab", p = "ab"
        Output: [0,1,2]
        Explanation:
        The substring with start index = 0 is "ab", which is an anagram of "ab".
        The substring with start index = 1 is "ba", which is an anagram of "ab".
        The substring with start index = 2 is "ab", which is an anagram of "ab".

 */





package Strings.Medium;

import java.util.ArrayList;
import java.util.List;

public class allAnagramStrings {

    static  List<Integer> findAnagrams(String s, String p) {
        
        List<Integer>ls = new ArrayList<>();
        String freqStringp = getFrequencyString(p);

        for(int i=0;i<s.length()-p.length()+1;i++){
            String str = "";
            str +=s.charAt(i);
            for(int j=i+1;j<p.length()+i;j++){
                str+=s.charAt(j);
            }

            String freqString = getFrequencyString(str);

            if(freqString.equals(freqStringp)){
                ls.add(i);
            }
        }

        return ls;
    }


    static String getFrequencyString(String str) {

        int[] freq = new int[26];
    
        for (char c : str.toCharArray()) {
          freq[c - 'a']++;
        }


        StringBuilder frequencyString = new StringBuilder("");
        char c = 'a';
        for (int i : freq) {
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }
    
        return frequencyString.toString();
      }

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";

        System.out.println(findAnagramsOptimal(s, p));
    }
}
