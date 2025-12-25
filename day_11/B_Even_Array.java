import java.util.*;

public class B_Even_Array {
    // public static int noOfMoves(int[] arr){

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int wrongEven = 0;
            int wrongOdd = 0;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 && a[i] % 2 != 0) {
                    wrongEven++;
                }
                if (i % 2 == 1 && a[i] % 2 == 0) {
                    wrongOdd++;
                }
            }

            if (wrongEven == wrongOdd) {
                System.out.println(wrongEven);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }    
}