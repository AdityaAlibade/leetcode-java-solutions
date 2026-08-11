class Solution {
    public int maxDistinct(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                continue;
            } else {
                map.put(ch, 1);
                count++;
            }
        }
        return count;
    }
}