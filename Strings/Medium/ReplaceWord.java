
/*

648. Replace Words
        Medium
        2.1K
        171
        Companies
        In English, we have a concept called root, which can be followed by some other word to form another longer word - let's call this word successor. For example, when the root "an" is followed by the successor word "other", we can form a new word "another".

        Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces, replace all the successors in the sentence with the root forming it. If a successor can be replaced by more than one root, replace it with the root that has the shortest length.

        Return the sentence after the replacement.

        Example 1:
        Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
        Output: "the cat was rat by the bat".

        Example 2:
        Input: dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
        Output: "a a b c".


 */



package Strings.Medium;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class ReplaceWord {

    static String replaceWords(List<String> dictionary, String sentence) {

        StringTokenizer st = new StringTokenizer(sentence, " ");
        String finalStr = "";
        while(st.hasMoreTokens()){

            String str = st.nextToken();
            for(String s : dictionary){

                if(str.regionMatches(0, s, 0, s.length())){
                    str = s;
                }
            }

            if(st.hasMoreElements()){

                finalStr +=str+" ";
            }

            else{
                finalStr +=str;
            }

        }

        return finalStr;
    }

    // static String getFrequncy(String str){

    //     int freq[] = new int[26];
    //     for(char ch : str.toCharArray()){
    //         freq[ch-'a']++;
    //     }

    //     String s ="";
    //     char c = 'a';

    //     for(int i : freq){
    //         s += c;
    //         s +=i;
    //     }

    //     return s;
    // }

    public static void main(String[] args) {

        String[] dictionary = {"cat","bat","rat"};
        String sentence = "the cattle was rattled by the battery";

        System.out.println(replaceWords(Arrays.asList(dictionary), sentence));
    }
}
