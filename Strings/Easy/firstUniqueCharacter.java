

/*

 387. First Unique Character in a String
    Easy
    8.2K
    264
    Companies
    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    

    Example 1:
    Input: s = "leetcode"
    Output: 0

    Example 2:
    Input: s = "loveleetcode"
    Output: 2

    Example 3:
    Input: s = "aabb"
    Output: -1


 */


package Strings.Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstUniqueCharacter {

    static int firstUniqChar(String s) {
        
        LinkedHashMap<Character,Integer>hm = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){

            int x = hm.getOrDefault(s.charAt(i),0);

            hm.put(s.charAt(i),x+1);
        }


        boolean flag = false;

        char ch = 'a';

        for(Map.Entry<Character,Integer>entry : hm.entrySet()){

            if(entry.getValue()==1){
                flag = true;
                ch = entry.getKey();
                break;
            }
        }

        if(flag){
            return s.indexOf(ch);
        }

        return -1;
    }


    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(firstUniqChar(s));
    }
}
