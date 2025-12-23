import java.util.*;

public class A_Twin_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
            }
            for (int num : arr) {
                System.out.print(max + 1 - num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}