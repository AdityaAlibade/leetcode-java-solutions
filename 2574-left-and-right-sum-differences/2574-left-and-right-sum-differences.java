class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int sum = 0;
        leftsum[0] = 0;
        for (int i = 1; i < n; i++) {
            sum += nums[i - 1];
            leftsum[i] = sum;
        }
        sum = 0;
        rightsum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            sum += nums[i + 1];
            rightsum[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return nums;
    }
}