class Solution {
    public int digitFrequencyScore(int n) {
        int digit = 0;
        int reversed_num = 0;
        while (n > 0){
            digit += n % 10;
            reversed_num = (reversed_num * 10) + digit ;
            n = n / 10;
        }
        return digit;     
    }
}