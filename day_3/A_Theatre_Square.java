import java.util.*;

public class A_Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
    
        int rows = (n - 1 + a) / a;
        int cols = (m - 1 + a) / a;
        System.out.println(rows * cols);
        sc.close();
    }

}
