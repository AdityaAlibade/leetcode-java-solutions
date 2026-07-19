class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
    
        StringBuilder s = new StringBuilder();
        int left = 0;
        int length = 1;

        for (int right = 1; right < chars.length; right++) {
            if (chars[left] == chars[right]) {
                length++;
            } else {
                s.append(chars[left]);
                if (length > 1) {
                    s.append(length);
                }
                left = right;
                length = 1;
            }
        }

        s.append(chars[left]);
        if (length > 1) {
            s.append(length);
        }

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}