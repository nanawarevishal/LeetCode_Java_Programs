

/*

171. Excel Sheet Column Number
        Easy
        4.5K
        347
        Companies
        Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

        For example:
        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28 
        ...
        

        Example 1:
        Input: columnTitle = "A"
        Output: 1

        Example 2:
        Input: columnTitle = "AB"
        Output: 28

        Example 3:
        Input: columnTitle = "ZY"
        Output: 701


 */


package Strings.Easy;

public class ExcelSheetNumber {

    static int titleToNumber(String columnTitle) {
            
        if(columnTitle.length()==1){
            return columnTitle.charAt(0)-'A'+1;
        }

        int sheetNumber = 0;

        for(int i=columnTitle.length()-1;i>=0;i--){
            sheetNumber  +=Math.pow(26,columnTitle.length()-1-i)*(columnTitle.charAt(i)-'A'+1);
        }

        return sheetNumber;
    }
    
    public static void main(String[] args) {
        String columnTitle = "AAA";

        System.out.println(titleToNumber(columnTitle));
    }
}
