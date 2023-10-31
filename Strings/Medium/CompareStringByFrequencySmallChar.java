

/*

1170. Compare Strings by Frequency of the Smallest Character
        Medium
        667
        967
        Companies
        Let the function f(s) be the frequency of the lexicographically smallest character in a non-empty string s. For example, if s = "dcce" then f(s) = 2 because the lexicographically smallest character is 'c', which has a frequency of 2.

        You are given an array of strings words and another array of query strings queries. For each query queries[i], count the number of words in words such that f(queries[i]) < f(W) for each W in words.

        Return an integer array answer, where each answer[i] is the answer to the ith query.

        

        Example 1:
        Input: queries = ["cbd"], words = ["zaaaz"]
        Output: [1]
        Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz").

        Example 2:
        Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
        Output: [1,2]
        Explanation: On the first query only f("bbb") < f("aaaa"). On the second query both f("aaa") and f("aaaa") are both > f("cc").

 */


package Strings.Medium;

public class CompareStringByFrequencySmallChar {

    static int[] numSmallerByFrequency(String[] queries, String[] words) {

        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){

            String str1 = getFrequency(queries[i]);
            int count = 0;
            for(int j=0;j<words.length;j++){
                String str2 = getFrequency(words[j]);

                System.out.println(str1);
                System.out.println(str2);

                int p = 1;
                int q = 1;

                while(p<str1.length() && q<str2.length()){

                    if(str1.charAt(p)-48==0){
                        p+=2;
                    }

                    if(str2.charAt(q)-48==0){
                        q+=2;
                    }

                    if(str1.charAt(p)-48!=0 && str2.charAt(q)-48!=0 && ((str1.charAt(p)-48) < (str2.charAt(q)-48))){
                        System.out.println(i+":"+str2);
                        count++;
                        break;
                    }
                    
                    if(str1.charAt(p)-48!=0 && str2.charAt(q)-48!=0 && ((str1.charAt(p)-48) >= (str2.charAt(q)-48))){
                        break;

                    }

                    

                }

                System.out.println(p);
                System.out.println(q);
                
            }

            ans[i] = count;
        }

        return ans;
    }


    static String getFrequency(String str){

        int freq[] = new int[26];

        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }

        String s = "";
        char c = 'a';

        for(int i : freq){
            s += c;
            s += i;
            c++;
        }

        return s;
    }


    public static void main(String[] args) {

        // String queries[] = {"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"}, words[] = {"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"};
        String queries[] = {"bba"}, words[] = {"bbbbbbbbbb"};

        // int ans[] = numSmallerByFrequency(queries, words);

        // for(int i=0;i<ans.length;i++){
        //     System.out.println(ans[i]+" ");
        // }

        System.out.println(getFrequency("bbbbbbbbbb"));

    }
}
