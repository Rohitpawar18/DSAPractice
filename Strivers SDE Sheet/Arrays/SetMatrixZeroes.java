public class SetMatrixZeroes{
  public static void main(String ar[]){

    int[][] matrix = {{1,1,1},
                      {1,0,1},
                      {1,1,1}};
    printMatrix(matrix);
    System.out.println();
    setZeroes(matrix);
  }

  public static void setZeroes(int[][] matrix){

    int col0 = 1;
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){

        if(matrix[i][j] == 0){
          // mark the i-th row
          matrix[i][0] = 0;

          // mark the j-th row
          if(j != 0)
            matrix[0][j] = 0;
          else
            col0 = 0;
          
        }
      }
    }

    for(int i = 1; i < matrix.length; i++){
      for(int j = 1; j < matrix[0].length; j++){
        if(matrix[i][j] != 0){
          // check for row & col
          if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
        }
      }
    }

    if(matrix[0][0] == 0){
      for(int j = 0; j < matrix[0].length; j++) matrix[0][j] = 0;
    }

    if(col0 == 0){
      for(int i = 0; i < matrix.length; i++) matrix[i][0] = 0;
    }

    printMatrix(matrix);
  }

  public static void printMatrix(int[][] matrix){
    
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}