//package BackTrack;

public class N_Queen {

    public static boolean is_safe(char board[][], int row, int col) {

        // VERTICAL
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // LEFT DIAGONAL
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // RIGHT DIAGONAL
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void nqueen(char board[][], int row) {
        if (row == board.length) {
            printboard(board);
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (is_safe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = 'X'; // Back Track Step
            }
        }
    }


    public static void printboard(char board[][]) {
        System.out.println("------------ NEXT ----------");
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();

        }

    }
    static int count=0;

    public static void main(String[] args) {
        int n = 13;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        nqueen(board, 0);
       System.out.println("Total ways = "+ count);
        //System.out.println(" \n Knights");

       // nKnights(board, n);

    }

}
