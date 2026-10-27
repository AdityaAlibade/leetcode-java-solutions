
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '#';
            }
        }

        String[] result = new String[m];
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            grid[i][j] = '.';
            if (j < n - 1) {
                j++;
            } else if (i < m - 1) {
                i++;
            } else {
                break;
            }
        }
        for (i = 0; i < m; i++) {
            result[i] = new String(grid[i]);
        }
        return result;
    }
}
