class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        for (int right = 0; right < t.length(); right++) {
            if (left < s.length() && s.charAt(left) == t.charAt(right)) {
                left++;
            }
        }
        return left == s.length();
    }
}