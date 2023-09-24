

/*
 451. Sort Characters By Frequency
        Medium
        6.7K
        228
        Companies
        Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
        Return the sorted string. If there are multiple answers, return any of them.

        

        Example 1:
        Input: s = "tree"
        Output: "eert"
        Explanation: 'e' appears twice while 'r' and 't' both appear once.
        So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.


        Example 2:
        Input: s = "cccaaa"
        Output: "aaaccc"
        Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
        Note that "cacaca" is incorrect, as the same characters must be together.


        Example 3:
        Input: s = "Aabb"
        Output: "bbAa"
        Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
        Note that 'A' and 'a' are treated as two different characters.

 */




package Strings.Medium;

import java.util.HashMap;
import java.util.List;
import java.util.*;

public class Sort_Characters_By_Frequency {

    static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
                int count = map.getOrDefault(s.charAt(i),0);
                map.put(s.charAt(i), count+1);
        }

        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
        public int compare(Map.Entry<Character, Integer> o1,
                            Map.Entry<Character, Integer> o2)
        {
            return (o1.getValue()).compareTo(o2.getValue());
        }
    });

        Collections.reverse(list);

        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        HashMap<Character,Integer>map2 = temp;

        String str = "";
        Set keys = map2.keySet();
        Iterator x = keys.iterator();

        // Collection getValues = map2.values();
        // Iterator i = getValues.iterator();

        List<Integer> values = new ArrayList<>(map2.values());

        for(int z =0;z<values.size();z++){
            int cnt = values.get(z);
            char ch = (Character)x.next();
           for(int k=1;k<=cnt;k++){
                str += ch;
           }

        }

        // Collection getValues = map2.values();
        // Iterator i = getValues.iterator();
        // while (i.hasNext()) {
        //     char ch = (Character)x.next();
        //    int cnt = (int)i.next();

        //    for(int k=1;k<=cnt;k++){
        //         str += ch;
        //    }

        // }

        return str;
    }
    
    public static void main(String[] args) {
        String s = "cccaaa";

        System.out.println(frequencySort(s));

    }
}
