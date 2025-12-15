//https://leetcode.com/problems/next-permutation/
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length, index = -1;
        for(int i = n-1; i > 0; i--){ //finding the spot where the order is wrong
            if(nums[i] > nums[i-1]){ //means there is a possibility to make the number larger and to find that spot
                index = i-1;
                break;
            }//else index will remain -1
        }
        if(index == -1){
            //Not possible to make the number more large so reverse
            reverse(nums, 0, n-1);
            return;
        }
        for(int i = n-1; i >= index; i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        reverse(nums, index+1, n-1); // reverse after that spot
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int s, int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}
