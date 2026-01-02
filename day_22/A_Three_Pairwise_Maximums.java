package day_22;
import java.util.*;

public class A_Three_Pairwise_Maximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long[] arr = new long[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long max = arr[2], min = arr[0];
            // for (int i = 1; i < arr.length; i++) {
            //     if(arr[i] >= max) max = arr[i];
            //     if(arr[i] < min) min = arr[i];
            // }
            int countMax = 0;
            //Counting frequency of max
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == max)
                    countMax++;
            }
            if(countMax < 2){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            System.out.print(max + " ");
            System.out.print(min + " ");
            System.out.print(min + "\n");
        }

        sc.close();
    }
}