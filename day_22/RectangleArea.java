package day_22;
//https://leetcode.com/problems/rectangle-area/

public class RectangleArea {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int a1 = (ax2 - ax1) * (ay2 - ay1); // Area of rectangle 1
        int a2 = (bx2 - bx1) * (by2 - by1); // Area of rectangle 2
        int a3 = 0;
        int l3 = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int b3 = Math.min(ay2, by2) - Math.max(ay1, by1);
        if(l3 > 0 && b3 > 0)
            a3 = l3 * b3; // Area of common part(if exists)

        return a1 + a2 - a3;
    }
}
