class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        int max = count;
        int start = 0;

        for (int end = k; end < s.length(); end++) {
            if (isVowel(s.charAt(start))) {
                count--;
            }
            start++;
            if (isVowel(s.charAt(end))) {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}