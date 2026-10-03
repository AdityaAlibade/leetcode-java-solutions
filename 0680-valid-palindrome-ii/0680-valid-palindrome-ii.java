class Solution {
    public boolean validPalindrome(String s) {
        int error_count = 0;
        boolean result = true;
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }
            else if (error_count == 0) {
                error_count++;
                int left = start + 1;
                int right = end;
                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }
                if (left >= right) {
                    return true;
                }
                left = start;
                right = end - 1;
                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }
                if (left >= right) {
                    return true;
                }

                return false;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}