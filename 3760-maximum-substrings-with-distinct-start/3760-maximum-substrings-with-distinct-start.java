class Solution {
    public int maxDistinct(String s) {
        int count = 0;
        String seen = "";
        for (int i = 0; i < s.length(); i++) {
            if (seen.contains(String.valueOf(s.charAt(i)))) {
                continue;
            } else {
                seen += s.charAt(i);
                count++;
            }
        }
        return count;
    }
}