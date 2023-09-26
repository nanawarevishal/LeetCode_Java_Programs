
/*
 1662. Check If Two String Arrays are Equivalent
        Easy
        2.3K
        176
        Companies
        Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

        A string is represented by an array if the array elements concatenated in order forms the string.

        

        Example 1:
        Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
        Output: true
        Explanation:
        word1 represents string "ab" + "c" -> "abc"
        word2 represents string "a" + "bc" -> "abc"
        The strings are the same, so return true.

        Example 2:
        Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
        Output: false.

        Example 3:
        Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
        Output: true.

 */




package Strings.Easy;

public class chechTwoStringEquivalent {
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String str1 = "";
        for(int i=0;i<word1.length;i++){
            str1 +=word1[i];
        }

        String str2 = "";
        for(String str : word2){
            str2 +=str;
        }

        if(str1.equals(str2)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
