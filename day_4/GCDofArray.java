package POTDs.day_4;

class GCDofArray {
    public int maxElement(int[] nums){
        int max = nums[0];
        for(int i : nums){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    public int minElement(int[] nums){
        int min = nums[0];
        for(int i : nums){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public int findGCD(int[] nums) {
        int n1 = maxElement(nums);
        int n2 = minElement(nums);
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
