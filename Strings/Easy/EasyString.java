

/*

 Easy string
        EasyAccuracy: 38.92%Submissions: 15K+Points: 2
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        You are given the string S . Compress the string when lower and upper cases are the same. In compressed string characters should be in lowercase.

        Example 1:
        Input: S = "aaABBb"
        Output: "3a3b"
        Explanation: As 'a' appears 3 times
        consecutively and 'b' also 3 times,
        and 'b' and 'B' considered as same. 


        Example 2:
        Input: S = "aaacca"
        Output: "3a2c1a"
        Explanation: As 'a' appears 3 times
        consecutively and 'c' also 2 times,
        and then 'a' 1 time.

 */


package Strings.Easy;

public class EasyString {

    static String transform(String S) 
    {  
        if(S.length()==1){
            return "1"+S.charAt(0);
        } 

        S = S.toLowerCase();
        int i=0;
        String str = "";
        while(i<S.length()){

            char ch = S.charAt(i);
            int left = i+1;
            int count = 1;
            while(left<S.length() && S.charAt(left)==ch){
                left++;
                count++;
            }

            str+=count;
            str+=ch;
            i = left;

        }

      
      return str;

    }

    public static void main(String[] args) {
        String S = "aab";

        System.out.println(transform(S));
    }
}
