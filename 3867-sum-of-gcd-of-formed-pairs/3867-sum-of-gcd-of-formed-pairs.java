class Solution {

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {

        ArrayList<Integer> prefixGcd = new ArrayList<>();
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            prefixGcd.add(gcd(nums[i], max));
        }

        Collections.sort(prefixGcd);
        long sum = 0;

        for (int i = 0; i < prefixGcd.size() / 2; i++) {
            int first = prefixGcd.get(i);
            int last = prefixGcd.get(prefixGcd.size() - 1 - i);
            sum += gcd(first, last);
        }

        return sum;
    }
}