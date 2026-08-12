class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int reversed = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;  
        }
        return Math.abs(num - reversed);
    }
}