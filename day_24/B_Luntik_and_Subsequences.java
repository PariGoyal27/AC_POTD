package day_24;
import java.util.*;

public class B_Luntik_and_Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c0 = 0, c1 = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] == 0) c0++; //counting number of zeroes
                else if(arr[i] == 1) c1++; //counting number of ones
            }
            long ans = (1L << c0) * c1;
            System.out.println(ans);
        }
        sc.close();
    }
}