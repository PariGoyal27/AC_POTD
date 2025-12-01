import java.util.Scanner;

public class SoldierAndBananas {
    public static int dollarsRequired(int k, int n, int w){
        int sum = k * (w * (w + 1)) / 2;
        return Math.max(sum - n, 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(dollarsRequired(k, n, w));
    }
}
