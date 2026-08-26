class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String result = "";
        int left = 0;
        int count = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                count++;
            }
            while (count > k) {
                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
            while (count == k && left <= right) {

                int length = right - left + 1;
                String current = s.substring(left, right + 1);

                if (length < minLength || (length == minLength && current.compareTo(result) < 0)) {
                    result = current;
                    minLength = length;
                }

                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
        }
        return result;
    }
}