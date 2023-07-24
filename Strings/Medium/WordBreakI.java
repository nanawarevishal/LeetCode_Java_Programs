

/*

 139. Word Break
        Medium
        14.6K
        613
        Companies
        Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

        Note that the same word in the dictionary may be reused multiple times in the segmentation.

        
        Example 1:
        Input: s = "leetcode", wordDict = ["leet","code"]
        Output: true
        Explanation: Return true because "leetcode" can be segmented as "leet code".


        Example 2:
        Input: s = "applepenapple", wordDict = ["apple","pen"]
        Output: true
        Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
        Note that you are allowed to reuse a dictionary word.

        Example 3:
        Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
        Output: false

 */


package Strings.Medium;

import java.util.ArrayList;
import java.util.List;

public class WordBreakI {
    static boolean wordBreak(String s, List<String> wordDict) {

        String str1 = s;
        int ind = 0;
        boolean flag = true;
        for(int i=0;i<wordDict.size();i++){

            if(ind>s.length()-1){
                return false;
            }
            String str = wordDict.get(i);
            str1 = str1.substring(ind);

            if(str1.contains(str)){
                ind = s.indexOf(str, ind)+str.length();
                flag = true;
            }

            else{
                return false;
            }
        }

        

        if(flag){
            return flag;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "catsandog";
        List<String>ls = new ArrayList<>();
        ls.add("cats");
        ls.add("dog");
        ls.add("sand");
        ls.add("and");
        ls.add("cat");

        System.out.println(wordBreak(s, ls));
    }
}
