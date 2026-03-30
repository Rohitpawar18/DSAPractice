import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {3,7,8},
            {9,11,13},
            {14,16,17}
        };

        System.out.println(luckyNumbers(arr));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        
        for(int i=0; i<matrix.length; i++){
            int minCol = findMinIndexInRow(matrix[i]);

            //find minimum in row
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }
            
            boolean isLucky = true;
            //find maximum in that column
            for(int k=0; k<matrix.length; k++){
                if(matrix[k][minCol] > matrix[i][minCol]){
                    isLucky = false;
                    break;
                }
            }

            //check lucky number
            if(isLucky){
                l.add(matrix[i][minCol]);
            }
        }

        return l;
    }

    private static int findMinIndexInRow(int[] row){
        int min = 0;
        for(int i=0; i<row.length; i++){
            if(row[i] < row[min]) min = i;
        }
        return min;
    }
}
