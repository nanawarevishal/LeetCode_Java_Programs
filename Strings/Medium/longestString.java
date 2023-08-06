
/*

3. Longest Substring Without Repeating Characters
        Medium
        35.9K
        1.6K
        Companies
        Given a string s, find the length of the longest 
        substring
        without repeating characters.

        

        Example 1:
        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.

        Example 2:
        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.

        Example 3:
        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring 

*/ 



package Strings.Medium;
import java.util.*;

public class longestString {

    static int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;
        }
        
        Map<Character,Integer>mp = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;

        int left =0;
        int right = 0;
        while(right<=s.length()-1){
            if(mp.containsKey(s.charAt(right))){
                left = Math.max(mp.get(s.charAt(right))+1, left);
            }

            maxLength = Math.max(maxLength, right-left+1);
            mp.put(s.charAt(right), right);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
