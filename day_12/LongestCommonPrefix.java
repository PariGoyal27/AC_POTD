public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //if array is empty
        if (strs.length == 0) return "";
        //if any string is enpty
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() == 0){
                return "";
            }
        }
        String str1 = strs[0];
        String ans = "";
        int j = 0;
        Boolean flag = true;
        
        
        while (flag && j < str1.length()) {
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || str1.charAt(j) != strs[i].charAt(j)) {
                    flag = false;
                    break;
                } 

            }
            if (flag) {
                ans += str1.charAt(j);
                j++;
            }
        }
        return ans;
    }
}