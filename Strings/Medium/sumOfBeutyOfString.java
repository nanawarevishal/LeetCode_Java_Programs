
/*
 1781. Sum of Beauty of All Substrings
        Medium
        724
        141
        Companies
        The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

        For example, the beauty of "abaacc" is 3 - 1 = 2.
        Given a string s, return the sum of beauty of all of its substrings.

        

        Example 1:
        Input: s = "aabcb"
        Output: 5
        Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.


        Example 2:
        Input: s = "aabcbaa"
        Output: 17


 */




package Strings.Medium;

import java.util.ArrayList;
import java.util.HashMap;


public class sumOfBeutyOfString {

    static int beautySum(String s) {

        ArrayList<String>ls = new ArrayList<>();
        for(int i=0;i<s.length()-2;i++){
            for(int j=i+2;j<s.length();j++){
                ls.add(s.substring(i, j+1));
            }
        }

        int ind =0;
        int beautySum=0;
        while(ls.size()>ind){
           String str = ls.get(ind);
           HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

           for(int i=0;i<str.length();i++){
                if(hm.containsKey(str.charAt(i))){
                    Integer freq = hm.getOrDefault(str.charAt(i), 0);
                    hm.put(str.charAt(i), freq+1);
                }
                else{
                    hm.put(str.charAt(i), 1);
                }
                
           }

           int max = Integer.MIN_VALUE;
           int min = Integer.MAX_VALUE;

           for(int val:hm.values()){
                max = Math.max(val,max);
                min = Math.min(val,min);
           }

           if(max-min!=0){
               beautySum +=(max-min);
           }
            ind++;
        }

        return beautySum;
    }

    public static void main(String[] args) {
        String s = "aabcbaa";

        System.out.println(beautySum(s));
    }
}
