//https://leetcode.com/problems/add-strings/
public class AddString {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int c = 0;
        int num = 0, sum = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || c != 0){
            int a = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int b = (j >= 0) ? num2.charAt(j) - '0' : 0;
            sum = a + b + c;
            sb.append(sum % 10);
            c = sum / 10;
            i--;
            j--;            
        }
        return sb.reverse().toString();
    }
}
