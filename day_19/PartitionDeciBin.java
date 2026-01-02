package day_19;
//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/

public class PartitionDeciBin {
    public int minPartitions(String n) {
        int len = n.length();
        int[] arr = new int[len];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            arr[i] = n.charAt(i) - '0';
            max = Math.max(max, arr[i]);
        }
        // Arrays.sort(arr);
        // return arr[len-1];
        return max;
    }
}
