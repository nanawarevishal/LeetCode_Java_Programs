/*

1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
        Easy
        780
        38
        Companies
        Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.

        Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

        A prefix of a string s is any leading contiguous substring of s.

        

        Example 1:
        Input: sentence = "i love eating burger", searchWord = "burg"
        Output: 4
        Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.

        Example 2:
        Input: sentence = "this problem is an easy problem", searchWord = "pro"
        Output: 2
        Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.

        Example 3:
        Input: sentence = "i am tired", searchWord = "you"
        Output: -1
        Explanation: "you" is not a prefix of any word in the sentence.

 */

package Strings.Easy;

class Solution {

    static int isPrefixOfWord(String sentence, String searchWord) {
        
        String[] st = sentence.split(" ");

        int count = 0;
        boolean flag = false;
        for(int i=0;i<st.length;i++){
            count++;
            if(searchWord.length() <= st[i].length() && searchWord.equals(st[i].substring(0,searchWord.length()))){
                flag =true;
                return count;
            }
        }

        if(!flag){
            return -1;
        }

        return count;

    }

    public static void main(String[] args) {
        
        String senteanse="this problem is an easy problem";
        String searchword="pro";

        int result=isPrefixOfWord(senteanse, searchword);

        System.out.println("index of serachword is " + searchword);
    }
}

