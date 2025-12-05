class Solution {
    // public int countDigits(int num){
    //     int count = 0;
    //     while(num != 0){
    //         int rem = num % 10;
    //         count++;
    //         num /= 10;
    //     }
    //     return count;
    // }
    public int sumDigits(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++){
            // int d = countDigits(i); //d = 4
            int d = (int)Math.log10(i) + 1;
            if(d % 2 == 0){
                int t = (int)Math.pow(10, d/2); // t = 100 to traverse half of the digits if d = 4
                int firstHalf = i / t; // number / 100 for first 2 digits
                int secHalf = i % t; // number % 100 for last 2 digits
                if(sumDigits(firstHalf) == sumDigits(secHalf)){
                    count++;
                }
            }
        }
        return count;
    }
}