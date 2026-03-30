
public class KthSmallestElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        System.out.println(kthSmallest(arr, k));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        //approach 1
        /*
        int n = matrix.length;
        int[] arr = new int[n*n];
        int index = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[index++] = matrix[i][j];
            }
        }

        Arrays.sort(arr);

        return arr[k-1];
         */

        //approach 2
        int n = matrix.length;

        int low = matrix[0][0];
        int high = matrix[n-1][n-1];

        while(low < high){
            int mid = low + (high - low) / 2;
            
            if(countLessEqual(matrix,mid) < k){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return low;
    }

    public static int countLessEqual(int[][] matrix, int mid){
        int n = matrix.length;
        int row = n - 1;
        int col = 0;
        int count = 0;
        
        while(row >= 0 && col < n){
            if(matrix[row][col] <= mid){
                count += (row + 1);
                col++;
            }else{
                row--;
            }
        }
        return count;
    }
}