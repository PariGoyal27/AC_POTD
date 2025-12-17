//https://leetcode.com/problems/reverse-words-in-a-string/
class ReverseWords {
    public String reverseWords(String s) {
        s = s.trim(); // remove leading and trailing spaces

        String[] str = s.split("\\s+"); // Split by one or more spaces

        //Method 1 : Using StringBuilder
        // StringBuilder sb = new StringBuilder();
        // for(int i = str.length-1; i >= 0; i--){
        //     sb.append(str[i]);
        //     if(i != 0) sb.append(" "); //Append space after each word except last
        // }
        // return sb.toString();

        //Method 2 : Reverse String Array
        int start = 0, end = str.length-1;
        while(start < end){
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", str);
    }
}
