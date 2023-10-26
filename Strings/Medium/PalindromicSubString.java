

/*

647. Palindromic Substrings
        Medium
        9.7K
        203
        Companies
        Given a string s, return the number of palindromic substrings in it.

        A string is a palindrome when it reads the same backward as forward.

        A substring is a contiguous sequence of characters within the string.

        

        Example 1:
        Input: s = "abc"
        Output: 3
        Explanation: Three palindromic strings: "a", "b", "c".

        Example 2:
        Input: s = "aaa"
        Output: 6
        Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

 */





package Strings.Medium;

public class PalindromicSubString {

    static int countSubstrings(String s) {
        int count = s.length();

        for(int i=0;i<s.length();i++){

            String str = s.charAt(i)+"";
            for(int j=i+1;j<s.length();j++){

                str += s.charAt(j);

                if(isPalindrome(str)){
                    count++;
                }
            }
        }

        return count;
    }

    static boolean isPalindrome(String str){

        int left = 0;
        int right = str.length()-1;

        while(left<right){
            
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String  s = "abc";
        System.out.println(countSubstrings(s));
        
    }
}
