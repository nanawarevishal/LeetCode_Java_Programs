
/*
 345. Reverse Vowels of a String
        Easy
        3.7K
        2.5K
        Companies
        Given a string s, reverse only all the vowels in the string and return it.

        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

        

        Example 1:
        Input: s = "hello"
        Output: "holle"


        Example 2:
        Input: s = "leetcode"
        Output: "leotcede"

 */



package Strings.Easy;

public class reveseVowelString {

    static String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int left =0;
        int right=s.length()-1;

        while(left<right){
            while(((s.charAt(left)!='a' && left<right) && ( s.charAt(left)!='e' && left<right)&& (s.charAt(left)!='i' && left<right) && (s.charAt(left)!='o' && left<right) && (s.charAt(left)!='u' && left<right)) &&((s.charAt(left)!='A' && left<right) && ( s.charAt(left)!='E' && left<right)&& (s.charAt(left)!='I' && left<right) && (s.charAt(left)!='O' && left<right) && (s.charAt(left)!='U' && left<right)) ){
                left++;
            }

            while(((s.charAt(right)!='a' && left<right) && ( s.charAt(right)!='e' && left<right) && (s.charAt(right)!='i' && left<right) && (s.charAt(right)!='o' && left<right) && (s.charAt(right)!='u' && left<right)&&((s.charAt(right)!='A' && left<right) && ( s.charAt(right)!='E' && left<right) && (s.charAt(right)!='I' && left<right) && (s.charAt(right)!='O' && left<right) && (s.charAt(right)!='U' && left<right)))){
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;

        }

        String str = new String(ch);

        return str;
    }

    public static void main(String[] args) {
        String s ="hello";

        System.out.println(reverseVowels(s));
    }
}
