class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        for(int i = 1; i< nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int i = 0; i< nums.length ; i++){
            if(nums[i] == max){
                return i;
            }
        }
        return -1;
    }
}