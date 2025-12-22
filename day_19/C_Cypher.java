//https://codeforces.com/problemset/problem/1703/C
import java.util.*;

public class C_Cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); //the number of wheels
            int[] arr = new int[n]; // the digits shown on the ith wheel
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt(); // number of operations
                String s = sc.next(); // D / U Sequence
                //The Logic -- as each wheel has its own operation string
                for (int j = 0; j < k; j++) {
                    if(s.charAt(j) == 'D'){
                        arr[i] = (arr[i]+1) % 10;
                    }else if(s.charAt(j) == 'U'){
                        arr[i] = (arr[i] > 0) ? arr[i]-1 : 9;
                    }
                }
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
