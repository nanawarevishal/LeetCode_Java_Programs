

/*

5. Longest Palindromic Substring
        Medium
        27.5K
        1.6K
        Companies
        Given a string s, return the longest 
        palindromic
        
        substring
        in s.

        Example 1:
        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.

        Example 2:
        Input: s = "cbbd"
        Output: "bb".

 */



package Strings.Medium;

public class LongestPalindromeSubstring {

    static String longestPalindrome(String s) {
        
        int len = Integer.MIN_VALUE;
        String finalString = "";
        boolean flag = false;

        for(int i=0;i<s.length();i++){

            String str = s.charAt(i)+"";
            for(int j = i+1;j<s.length();j++){

                str +=s.charAt(j);

                if(str.length()>len && isPalindrome(str)){
                    flag = true;
                    len = str.length();
                    finalString = str;
                }

            }
        }

        if(!flag){
            return s.charAt(0)+"";
        }

        return finalString;
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
        
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
