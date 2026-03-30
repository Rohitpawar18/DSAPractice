import java.util.*;

public class RowColMatrix {
    public static void main(String ar[]){
        int[][] matrix = {
            // {10,20,30,40},
            // {15,25,35,45},
            // {28,29,37,50},
            // {33,34,38,50}
            {1,2,3,4},
            {5,6,7,8},
            {9,10,12,13},
            {14,15,16,17}
        };

        int target = 6;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target){
        
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[] {row, col};
            }

            if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }

        return new int[] {-1,-1};
    }
}
