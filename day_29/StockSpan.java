package day_29;
//https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
import java.util.*;

public class StockSpan {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();   
            }
            list.add(st.isEmpty() ? i+1 : i-st.peek());
            st.push(i);
        }
        return list;
    }
}
