import java.util.*;

public class A_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x = 0;
        while (n-- > 0) {
            String s = sc.nextLine();
            if(s.contains("++")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}