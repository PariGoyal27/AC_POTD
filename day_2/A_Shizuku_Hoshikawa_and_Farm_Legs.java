import java.util.Scanner;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void combinations(int[] legs){
        for (int l : legs) {
            if(l % 2 != 0){
                System.out.println(0);
            }else{
                System.out.println(l/4 + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
        }
        combinations(arr);
        scanner.close();
    }
}