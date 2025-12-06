import java.util.*;

public class A_New_Palindrome {
    public static boolean isPossiblePalin(String s){
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < s.length()/2; i++) {
            unique.add(s.charAt(i));
        }
        if(unique.size() > 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            if(isPossiblePalin(str[i])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}