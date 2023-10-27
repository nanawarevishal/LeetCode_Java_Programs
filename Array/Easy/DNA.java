package Array.Easy;

import java.util.*;
public class DNA {

    static HashMap<Character,Integer> DNAString(String str){

        HashMap<Character,Integer>hm = new HashMap<>();

        for(int i=0;i<str.length();i++){

            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }

        // System.out.println(hm);

        return hm;

    }

    public static void main(String[] args) {
        
        String str = "ATGCTGA";

        System.out.println(DNAString(str));
    }
}
