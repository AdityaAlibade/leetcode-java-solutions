class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> list = new ArrayList<>();
        int altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            list.add(altitude);
        }
        int result = Collections.max(list);
        if (result > 0) {
            return result;
        } else {
            return 0;
        }
    }
}