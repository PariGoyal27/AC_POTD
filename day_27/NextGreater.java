package day_27;
//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
import java.util.*;

public class NextGreater {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        int[] ans = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(ans[i]);
        }
        return list;
    }
}
