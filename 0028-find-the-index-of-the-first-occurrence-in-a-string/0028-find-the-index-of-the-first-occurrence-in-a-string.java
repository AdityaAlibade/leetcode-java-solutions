class Solution {
    public int strStr(String haystack, String needle) {
        String[] str1 = haystack.split("");
        String[] str2 = needle.split("");
        int index = 0;
        int start = 0;
        if (str2.length == 0) {
            return 0;
        }
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].equals(str2[index])) {
                index++;
                if (index == str2.length) {
                    return i - index + 1;
                }
            } else {
                index = 0;
                start++;
                i = start - 1;
            }
        }
        return -1;
    }
}