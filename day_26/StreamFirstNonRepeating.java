package day_26;
//https://www.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1
import java.util.*;

public class StreamFirstNonRepeating {
    public String firstNonRepeating(String s) {
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(freq[ch-'a'] == 0)
                q.offer(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.poll();
            }
            sb.append(q.isEmpty() ? '#' : q.peek());
        }
        return sb.toString();
    }
}
