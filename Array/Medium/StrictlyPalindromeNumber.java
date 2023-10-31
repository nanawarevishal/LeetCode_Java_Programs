
/*

2396. Strictly Palindromic Number
        Medium
        509
        1.4K
        Companies
        An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation of the integer n in base b is palindromic.

        Given an integer n, return true if n is strictly palindromic and false otherwise.

        A string is palindromic if it reads the same forward and backward.

        

        Example 1:
        Input: n = 9
        Output: false
        Explanation: In base 2: 9 = 1001 (base 2), which is palindromic.
        In base 3: 9 = 100 (base 3), which is not palindromic.
        Therefore, 9 is not strictly palindromic so we return false.
        Note that in bases 4, 5, 6, and 7, n = 9 is also not palindromic.

        Example 2:
        Input: n = 4
        Output: false
        Explanation: We only consider base 2: 4 = 100 (base 2), which is not palindromic.
        Therefore, we return false.


 */




package Array.Medium;

public class StrictlyPalindromeNumber {

    static boolean isStrictlyPalindromic(int n) {
        
        for(int i=2;i<=n-2;i++){
            int temp = n;

            String str = "";
            while(temp!=0){

                int rem = temp % i;

                str = rem+str;

                temp/=i;
            }

            // System.out.println(str);

            if(!isPalindrome(str)){
                return false;
            }
        }

        return true;
       
    }

    static boolean isPalindrome(String str){
            int left =0;
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
        
        System.out.println(isStrictlyPalindromic(5));
    }
}
