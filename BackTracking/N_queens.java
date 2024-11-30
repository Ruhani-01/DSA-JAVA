public class N_queens {
    public static boolean isSafe(char board[][], int row, int col) {
        // Vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nqueen(char board[][], int row) {
        if (row == board.length) {
            print(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place queen
                nqueen(board, row + 1); // Recursive call
                board[row][j] = '.'; // Backtrack by removing the queen
            }
        }
    }

    public static void print(char board[][]) {
        System.out.println("-------C H E S S B O A R D-------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; // Set to 4 for a proper N-Queens solution
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.'; // Initialize the board with empty spaces
            }
        }
        nqueen(board, 0); // Start solving from row 0
    }
}
