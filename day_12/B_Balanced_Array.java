import java.util.*;
public class B_Balanced_Array {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n/2 % 2 == 0){
                int[] arr = new int[n];
                int sumLeft = 0, sumRight = 0, j = 2;
                for (int l = 0; l < n/2; l++) {
                    arr[l] = j;
                    sumLeft += arr[l];
                    j += 2;
                }  
                j = 1;
                int r = n/2;
                for (r = n/2; r < n-1; r++) {
                    arr[r] = j;
                    sumRight += arr[r];
                    j += 2;
                }
                arr[r] = sumLeft-sumRight;
                System.out.println("YES");
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else{
                System.out.println("NO");                
            }
        }   
    }
}