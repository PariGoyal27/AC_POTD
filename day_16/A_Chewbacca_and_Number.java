import java.util.*;

public class A_Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num = sc.next().toCharArray();
        for (int i = 0; i < num.length; i++) {
            int d = num[i] - '0';
            //don't change leading 9
            if(i == 0 && d == 9) continue;

            if(d >= 5){
                num[i] = (char)('0' + (9 - d));
            }
        }
        System.out.println(new String(num));       
    }
}
    // public static long reverse(long num){
    //     long rev = 0;
    //     while(num > 0){
    //         int rem = (int)num % 10;
    //         rev = rev*10 + rem;
    //         num /= 10;
    //     }
    //     return rev;
    // }
         // long x = sc.nextLong();
        // int digit = (int)Math.log10(x) + 1;
        // long rev = 0;
        // while (digit-- > 0) {
        //     int rem = (int)x % 10;
        //     if(rem > 4 && !(digit == 0 && rem == 9)){
        //         rem = 9 - rem;
        //     }
        //     rev = rev * 10 + rem;
        //     x /= 10;
        // }
        // System.out.println(reverse(rev));