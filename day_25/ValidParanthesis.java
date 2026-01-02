package day_25;
//https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.isEmpty()) return false;
                if(
                ch == ')' && st.peek() != '(' ||
                ch == '}' && st.peek() != '{' ||
                ch == ']' && st.peek() != '['
                ) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
