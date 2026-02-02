//package BackTrack;

public class Sudoko {

    public static boolean is_safe(int sudoko[][], int row, int col, int digit) {

        // Column
        for (int i = 0; i < 9; i++) {
            if (sudoko[i][col] == digit) {
                return false;
            }
        }

        // Row
        for (int i = 0; i < 9; i++) {
            if (sudoko[row][i] == digit) {
                return false;
            }
        }
        // Grid
        int start_row = (row / 3) * 3;
        int start_col = (col / 3) * 3;

        for (int i = start_row; i < start_row + 3; i++) {
            for (int j = start_col; j < start_col + 3; j++) {
                if (sudoko[i][j] == digit) {
                    return false;
                }
            }

        }

        return true;

    }

    public static boolean sudoko_solver(int sudoko[][], int row, int col) {

        // Base Case
        if (row == 9) {
            return true;
        }

        int nextrow = row, nextcol = col + 1;

        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }

        if (sudoko[row][col] != 0) {

          return  sudoko_solver(sudoko, nextrow, nextcol);
        }

        for (int i = 0; i <= 9; i++) {

            if (is_safe(sudoko, row, col, i)) {
                sudoko[row][col] = i;
                if (sudoko_solver(sudoko, nextrow, nextcol)) {
                    return true;
                }
                sudoko[row][col] = 0;
            }

        }
        return false;
    }

    public static void print_sudoku(int sudoko[][]){

        for (int i = 0; i < sudoko.length; i++) {
            for (int j = 0; j < sudoko[0].length; j++) {
                System.out.print(sudoko[i][j]+"  "); 
                if (j==2 || j==5) {
                    System.out.print("|"+ " ");   
                }
            }
            System.out.println();   
            if (i==2 || i==5) {
                System.out.print("-----------------------------");   
                System.out.println();
            }
       
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                           { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                           { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                           { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                           { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                           { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                           { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                           { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                           { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };


         if(sudoko_solver(sudoku, 0, 0))    
         {
            print_sudoku(sudoku); 

         }
                       

    }

}
