class Solution {
    public int largestAltitude(int[] gain) {
        Stack<Integer> s = new Stack<>();
        int altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            s.push(altitude);
        }
        int result = Collections.max(s);
        if (result > 0) {
            return result;
        } else {
            return 0;
        }
    }
}