

/*


 686. Repeated String Match
        Medium
        2.1K
        946
        Companies
        Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.

        Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".

        Example 1:
        Input: a = "abcd", b = "cdabcdab"
        Output: 3
        Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.


        Example 2:
        Input: a = "a", b = "aa"
        Output: 2


 */



package Strings.Medium;

public class repeatStringMatch {
    static int repeatedStringMatch(String a, String b) {

        if(a.equals(b)){
            return 1;
        }
        
        if(a.contains(b)){
            return 0;
        }

        int count=1;
        while(!a.contains(b)){
            a +=a;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        String a = "a";
        String b = "aa";

        System.out.println(repeatedStringMatch(a,b));
    }
}
