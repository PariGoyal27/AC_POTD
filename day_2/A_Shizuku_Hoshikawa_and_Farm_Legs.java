import java.util.Scanner;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {

    public static void combinations(int[] arr) {
        for (int x : arr) {
            if (x % 2 != 0) {
                System.out.println(0);
            } else {
                System.out.println(x / 4 + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        combinations(arr);
        sc.close();
    }
}
