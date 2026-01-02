package day_19;
//https://leetcode.com/problems/string-compression-iii/

public class StringCompressionIII {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        int i = 0;
        while(i < n){
            int count = 0;
            char ch = word.charAt(i);
            while(i < n && ch == word.charAt(i) && count < 9){
                count++;
                i++;
            }
            sb.append(count).append(ch);
        }
        return sb.toString();
    }
}
