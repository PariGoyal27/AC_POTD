import java.util.*;

public class B_Long_Long {
    public static void sumAndOperations(long[] arr){
        int op = 0, flag = 1;
        long maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSum += Math.abs(arr[i]);
            if (arr[i] < 0 && flag == 1) {
                flag = 0;
                op++;
            }else if(arr[i] > 0)
                flag = 1;
        }
        System.out.println(maxSum + " " + op);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
            }
            sumAndOperations(arr);
        }
        sc.close();
    }    
}