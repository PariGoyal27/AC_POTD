package day_25;
//https://www.geeksforgeeks.org/problems/reverse-a-string-using-stack/1

import java.util.Stack;

public class ReverseUsingStack {
    public String reverse(String S) {
        // code here
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            st.push(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
