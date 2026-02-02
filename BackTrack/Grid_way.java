public class Grid_way {

    public static int grid_way(int matrix[][], int row, int col , int i , int j) {

        if (i==row-1 && j==col-1) {
            return 1;
        }
        else if (i==row || j==col) {
            return 0;
            
        }

        int w1=0,w2=0,w3=0,w4=0;
        //Down
        if (matrix[i+1][j] !=0) {
             w1=grid_way(matrix,row, col, i+1, j);
        }
        //Right
        if (matrix[i][j+1] !=0) {
         w2=grid_way(matrix,row, col, i, j+1);
        }

        // //UP
        // if(matrix[i][j+1] ==0 && matrix[i+1][j] !=0 && matrix[i][j-1] ==0 )
        // {
        //     w3=grid_way(matrix, row, col, i-1, j);
        // }

          //Left
          if(matrix[i][j+1] ==0 && matrix[i+1][j] !=0 && matrix[i-1][j] ==0 )
          {
              w4=grid_way(matrix, row, col, i-1, j);
          }
        return w1+w2+w3+w4;
        
    }
    
    
    
    
    public static void main(String[] args) {

        int row=3,col=3;

        int matrix[][]={{1,1,1,1},
                        {0,1,0,1},
                        {1,1,1,1},
                        {1,0,1,1},};
                                   

        System.out.println(grid_way(matrix,row,col,0,0));
        
    }
    
}
