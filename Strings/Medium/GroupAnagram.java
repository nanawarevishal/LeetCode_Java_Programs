

/*

 49. Group Anagrams
        Medium
        16.1K
        458
        Companies
        Given an array of strings strs, group the anagrams together. You can return the answer in any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

        

        Example 1:
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        Example 2:
        Input: strs = [""]
        Output: [[""]]

        Example 3:
        Input: strs = ["a"]
        Output: [["a"]]

 */

package Strings.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupAnagram {

    static List<List<String>> groupAnagrams(String[] strs) {

        
        if (strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyStringsMap = new HashMap<>();
        for (String str : strs) {

        String frequencyString = getFrequencyString(str);

        if (frequencyStringsMap.containsKey(frequencyString)) {
            frequencyStringsMap.get(frequencyString).add(str);
        }
        else {
            
            List<String> strList = new ArrayList<>();
            strList.add(str);
            frequencyStringsMap.put(frequencyString, strList);
        }
        }

        return new ArrayList<>(frequencyStringsMap.values());
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
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>>ls = groupAnagrams(strs) ;

        System.out.println(ls);
    }
}
