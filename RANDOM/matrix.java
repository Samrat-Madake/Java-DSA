import java.util.Scanner;

/*This code contain Matrix examples
 1 search();
 2 largest_smallest_in_matrix();
 3 diagonal_sum();
 4 frequency_of_key_in_matrix();
 5  transpose_of_matrix();
 
 */

public class matrix {

    public static void Print_matrix(int matrix[][]) {
        System.out.println("Output : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose_of_matrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;

        int matrix2[][] = new int[col][row];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrix2[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose matrix = ");
        Print_matrix(matrix2);

    }

    public static void frequency_of_key_in_matrix(int matrix[][], int key) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    counter++;
                }
            }
        }

        System.out.println("The key " + key + " occured " + counter + " times.");

    }

    public static void diagonal_sum(int matrix[][]) {

        int n = matrix.length;
        // int sum1=0,sum2=0;
        // int x=0;
        // // If the matrix is of odd length(3,5,7..)
        // // then we have to subtract the middle element from the Result//
        // if (n%2!=0) {
        // x=(n-1)/2;
        // }
        // for (int i = 0; i < n; i++) {
        // sum1=sum1+matrix[i][i];
        // }
        // for (int i = 0; i < n; i++) {
        // int j=n-i-1;
        // sum2=sum2+matrix[i][j];
        // }
        // if (x==0) {
        // System.out.println("Total of 2 diagonal sum = "+ (sum1+sum2));
        // }
        // else
        // {
        // System.out.println("Total of 2 diagonal sum = "+ ((sum1+sum2)-matrix[x][x]));
        // }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + matrix[i][i];

            if (i != n - 1 - i) {
                sum = sum + matrix[i][n - 1 - i];
            }
        }
        System.out.println("total = " + sum);

    }

    public static void largest_smallest_in_matrix(int matrix[][]) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] >= largest) {
                    largest = matrix[i][j];
                }
                if (matrix[i][j] <= smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest element is =" + smallest);
        System.out.println("largest element is =" + largest);
    }

    public static void search(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key is found at index (" + i + " " + j + ")");
                }
            }
        }

        System.out.println("Key not found");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[2][3];

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
         System.out.println("Rows = " + row + " Col = " + col);
           Print_matrix(matrix);
       


        // search(matrix, 8);
        // largest_smallest_in_matrix(matrix);
        // diagonal_sum(matrix);
         frequency_of_key_in_matrix(matrix, 4);


        //transpose_of_matrix(matrix);
        sc.close();
    }
}