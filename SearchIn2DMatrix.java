public class SearchIn2DMatrix {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,12,13},
            {14,15,16,17}
        };
        int target = 1;
        System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i < row; i++){
            if(target >= matrix[i][0] && target <= matrix[i][col - 1]){

                int start = 0;
                int end = matrix[i].length - 1;
                while(start <= end){
                    int mid = start + (end - start) / 2;

                    if(matrix[i][mid] == target) return true;

                    if(target <= matrix[i][mid]){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }
            }
        }
        return false;
    } 
}
