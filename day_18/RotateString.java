// package day_18;
//https://leetcode.com/problems/rotate-string/description/

public class RotateString {
     public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        String mix = s + s;
        return mix.contains(goal);
    }
}
