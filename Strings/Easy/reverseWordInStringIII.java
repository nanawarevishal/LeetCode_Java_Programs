

/*
 557. Reverse Words in a String III
        Easy
        5K
        228
        Companies
        Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

        

        Example 1:
        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"

        Example 2:
        Input: s = "God Ding"
        Output: "doG gniD"

 */



package Strings.Easy;

public class reverseWordInStringIII {

    static String reverseWords(String s) {
        
       String str = "";

       String a[] = s.split(" ");

       for(int i=0;i<a.length;i++){
           
           String b = a[i];
           char ch[] = b.toCharArray();
           int left=0;
           int right =ch.length-1;

           while(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
           }

           str +=new String(ch)+" ";
       }

       str = str.trim();
       return str;
   }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }
}
