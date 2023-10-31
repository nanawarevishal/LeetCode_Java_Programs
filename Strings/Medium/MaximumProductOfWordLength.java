
/*

318. Maximum Product of Word Lengths
        Medium
        3.4K
        138
        Companies
        Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.

        

        Example 1:
        Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
        Output: 16
        Explanation: The two words can be "abcw", "xtfn".

        Example 2:
        Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
        Output: 4
        Explanation: The two words can be "ab", "cd".

        Example 3:
        Input: words = ["a","aa","aaa","aaaa"]
        Output: 0
        Explanation: No such pair of words.

 */



package Strings.Medium;

import java.util.HashSet;

public class MaximumProductOfWordLength {

    static int maxProduct(String[] words) {
        
        int maxProd = 0;
        for(int i=0;i<words.length;i++){
            HashSet<Character>hs = new HashSet<>();

            for (char c : words[i].toCharArray()){
                hs.add(c);
            }
            
            for(int j=i+1;j<words.length;j++){
                boolean flag = true;
                for(char ch : words[j].toCharArray()){
                    if(hs.contains(ch)){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    maxProd = Math.max(maxProd,words[i].length()*words[j].length());
            }
        }

        return maxProd;
    }

    public static void main(String[] args) {

        String words[] = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(maxProduct(words));
        
    }
}
