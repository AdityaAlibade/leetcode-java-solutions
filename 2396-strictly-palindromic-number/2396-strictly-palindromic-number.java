class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            int num = n;
            String str = "";

            while (num > 0) {
                str = (num % base) + str;
                num = num / base;
            }

            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}