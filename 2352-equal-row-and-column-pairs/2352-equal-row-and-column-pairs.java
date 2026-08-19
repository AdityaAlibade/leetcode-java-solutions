class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            String row = Arrays.toString(grid[i]);
            map.put(row, map.getOrDefault(row, 0) + 1);
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = grid[i][j];
            }
            String col = Arrays.toString(column);
            if (map.containsKey(col)) {
                count += map.get(col);
            }
        }
        return count;
    }
}