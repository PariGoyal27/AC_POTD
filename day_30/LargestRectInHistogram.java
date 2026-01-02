package day_30;

import java.util.Stack;

public class LargestRectInHistogram {
    public static int[] NSL(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nsl = new int[n];
        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nsl[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return nsl;
    }
    public static int[] NSR(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nsr = new int[n];
        for (int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nsr[i] = st.isEmpty() ? n : st.peek(); // n is the index where height is 0 means smaller than any other element in the array
            st.push(i);
        }
        return nsr;
    }
    public int largestRectangleArea(int[] heights) {
        int[] nsr = NSR(heights);
        int[] nsl = NSL(heights);
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int area = heights[i]*(nsr[i] - nsl[i] - 1); // height = heights[i] and width = nsrIndex - nslIndex - 1
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
