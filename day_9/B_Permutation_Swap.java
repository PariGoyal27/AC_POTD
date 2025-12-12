import java.util.*;

public class B_Permutation_Swap {
    public static int gcd(int n1, int n2){
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
    public static int countK(int[] arr, int n){        
        int g = 0;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            k = Math.abs(arr[i-1] - i);  
            g = gcd(g, k);
        }
        return g;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] ans = new int[tc];
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            ans[i] = countK(arr, n);
        }  
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        } 
    }    
}