//https://leetcode.com/problems/rotate-array/
class RotateArray {
    public void reverseArr(int[] nums, int s, int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverseArr(nums, 0, n-1); //first rotate the whole array
        reverseArr(nums, 0, k-1); //reverse first k elements
        reverseArr(nums, k, n-1); //reverse remaining elements
    }
}