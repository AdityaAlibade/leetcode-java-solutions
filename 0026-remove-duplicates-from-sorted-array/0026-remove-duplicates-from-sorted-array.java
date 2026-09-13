class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int sec = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[sec] = nums[i];
                sec++;
            }
        }
        return sec;
    }
}