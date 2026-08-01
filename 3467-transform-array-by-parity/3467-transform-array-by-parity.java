class Solution {
    public int[] transformArray(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < evenCount) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        return nums;
    }
}