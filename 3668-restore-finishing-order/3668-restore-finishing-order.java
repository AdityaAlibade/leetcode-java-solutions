class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for (int id : friends) {
            set.add(id);
        }
        int[] ans = new int[friends.length];
        int index = 0;
        for (int id : order) {
            if (set.contains(id)) {
                ans[index++] = id;
            }
        }
        return ans;
    }
}