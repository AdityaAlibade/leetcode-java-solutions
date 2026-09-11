class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int n = str.length-1;
        int wordlength = str[n].length();
        return wordlength;
    }
}