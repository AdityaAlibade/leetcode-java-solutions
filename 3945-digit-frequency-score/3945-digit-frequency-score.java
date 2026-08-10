class Solution {
    public int digitFrequencyScore(int n) {
        int digit = 0;
        while (n > 0){
            digit += n % 10;
            n = n / 10;
        }
        return digit;     
    }
}