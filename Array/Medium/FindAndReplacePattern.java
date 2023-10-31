

/*

890. Find and Replace Pattern
        Medium
        3.8K
        168
        Companies
        Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.

        A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

        Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.

        

        Example 1:
        Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
        Output: ["mee","aqq"]
        Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
        "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.

        Example 2:
        Input: words = ["a","b","c"], pattern = "a"
        Output: ["a","b","c"]
        

        Constraints:

        1 <= pattern.length <= 20
        1 <= words.length <= 50
        words[i].length == pattern.length
        pattern and words[i] are lowercase English letters.


 */


package Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {

    static List<String> findAndReplacePattern(String[] words, String pattern) {

        ArrayList<String>ls = new ArrayList<>();

        String str1 = frequencyString(pattern);

        for(int i=0;i<words.length;i++){

            boolean flag = false;
            String str2 = frequencyString(words[i]);

            if(pattern.length()!=words[i].length()){
                continue;
            }

            for(int j=1;j<str1.length();j+=2){
                if(str1.charAt(j)!=str2.charAt(j)){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                ls.add(words[i]);
            }
            
        }

        return ls;
    }

    static String frequencyString(String str){

        if(str.length()==1){
            return str+1+"";
        }

        int count = 1;
        String s = "";
        for(int i=1;i<str.length();i++){

            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }

            else{
                s =s + str.charAt(i-1)+count+"";
                count = 1;
            }
        }

        s = s + str.charAt(str.length()-1)+count;

        return s;
    }



    public static void main(String[] args) {

        String words[] = {"badc","abab","dddd","dede","yyxx"}, pattern = "baba";

        System.out.println(findAndReplacePattern(words, pattern));
        
    }

    // Expected ["abab","dede"]
}
