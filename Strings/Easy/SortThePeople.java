

/*

 2418. Sort the People
        Easy
        1.1K
        17
        Companies
        You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

        For each index i, names[i] and heights[i] denote the name and height of the ith person.

        Return names sorted in descending order by the people's heights.

        

        Example 1:
        Input: names = ["Mary","John","Emma"], heights = [180,165,170]
        Output: ["Mary","Emma","John"]
        Explanation: Mary is the tallest, followed by Emma and John.

        Example 2:
        Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
        Output: ["Bob","Alice","Bob"]
        Explanation: The first Bob is the tallest, followed by Alice and the second Bob.

 */


package Strings.Easy;

public class SortThePeople {

    static String[] sortPeople(String[] names, int[] heights) {
        
        for(int i=0;i<heights.length-1;i++){

            for(int j=i+1;j<heights.length;j++){

                if(heights[i]<heights[j]){

                    int temp1 = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp1;

                    String temp2 = names[i];
                    names[i] = names[j];
                    names[j] = temp2;
                }
            }
        }

        return names;
    }

    public static void main(String[] args) {
        String names[] = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        String str[] = sortPeople(names, heights);

        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}
