package day_23;

public class MinOpToMove {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int op = 0;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                if(boxes.charAt(j) == '1'){
                    op +=  Math.abs(j - i);
                }
            }
            ans[i] = op;
        }
        return ans;
    }
}
