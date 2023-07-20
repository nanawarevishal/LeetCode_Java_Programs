
/*

 20. Valid Parentheses
        Easy
        20.6K
        1.3K
        Companies
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.
        

        Example 1:
        Input: s = "()"
        Output: true


        Example 2:
        Input: s = "()[]{}"
        Output: true

        Example 3:
        Input: s = "(]"
        Output: false

 */





package Stack.Easy;

import java.util.Stack;

public class ParenthesisCheck {
    static boolean isValid(String s) {

        Stack<Character>st = new Stack<>();

        for(char ch1:s.toCharArray()){
            if(ch1=='{' || ch1=='[' || ch1=='('){
                st.push(ch1);
            }

            else{
                if(st.isEmpty()){
                    return false;
                }

                char ch2 = st.pop();
                if(ch1==']' && ch2=='[' || ch1=='}' && ch2=='{' || ch1==')' && ch2=='('){
                    continue;
                }

                else{
                    
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    
    public static void main(String[] args) {

        String s = "()[]{}";

        System.out.println(isValid(s));

    }

}

