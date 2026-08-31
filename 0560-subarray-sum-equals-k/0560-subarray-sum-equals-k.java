class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int start = 0;

        for (start = 0; start < n; start++) {
            int sum = 0;
            for (int i = start; i < n; i++) {
                sum += nums[i];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}