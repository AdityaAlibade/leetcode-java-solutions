class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    if (list.contains(board[i][j])) {
                        return false;
                    }
                    list.add(board[i][j]);
                }
            }
        }
        for (int j = 0; j < board.length; j++) {
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] != '.') {
                    if (list.contains(board[i][j])) {
                        return false;
                    }
                    list.add(board[i][j]);
                }
            }
        }
        for (int row = 0; row < board.length; row += 3) {
            for (int col = 0; col < board.length; col += 3) {
                ArrayList<Character> list = new ArrayList<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] != '.') {
                            if (list.contains(board[i][j])) {
                                return false;
                            }
                            list.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}