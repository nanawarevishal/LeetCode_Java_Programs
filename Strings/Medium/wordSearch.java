
/*

 Word Search
        MediumAccuracy: 49.93%Submissions: 667+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given a string s and matrix of characters mat having n number of rows and m number of columns. Find if string exist in the grid.

        The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

        Example 1:
        Input:
        n = 4 , m = 4
        mat = [ ['a','b','c','d'],['e','f','g','h'],['i','j','k','l'],['m','n','o','p'] ]
        str = "bcgkjn"
        Output: 1
        Explanation: 
        Follow the path ( 0,1 ), ( 0,2 ), ( 1,2 ), ( 2,2 ), ( 2,1 ), ( 3,1 ).

        Example 2:
        Input:
        n = 4 , m = 4
        mat = [ ['a','b','c','d'],['e','f','g','h'],['i','j','k','l'],['m','n','o','p'] ]
        str = "adeijp"
        Output: 0
        Explanation:
        No path is available following which we can generate required string. 

 */



package Strings.Medium;

public class wordSearch {

    static boolean wordSearchs(char m[][],String w) {

        int row=-1;
        int x = w.charAt(0)-97;
        int col = (x % m[0].length);
         System.out.println(m[0].length);
        
        if(w.charAt(0)>=97 && w.charAt(0)<=100){
            row = 0;
        }

        else if(w.charAt(0)>=101 && w.charAt(0)<=104){
            row = 1;
        }
        else if(w.charAt(0)>=105 && w.charAt(0)<=108){
            row = 2;
        }
        else{
            row = 3;
        }

       

        for(int i=1;i<w.length();i++){
            
            System.out.println(col);
            if(row+1 <m.length && m[row+1][col]==w.charAt(i)){
                row = row+1;
            }

            else if((col+1) < m[0].length && m[row][col+1]==w.charAt(i)){
                col = col + 1;
            }

            else if(row-1>= 0 && m[row-1][col]== w.charAt(i)){
                row = row-1;
            }

            else if(col-1>=0 && m[row][col-1] == w.charAt(i)){
                col = col -1;
            }

            else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][]  mat = {{'x','f'},
                        {'i','r'},
                        {'c','v'}};
        String str = "scxg";

        System.out.println(wordSearchs(mat, str));
    }
}
