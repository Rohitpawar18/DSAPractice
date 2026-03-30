import java.util.*;
public class MinNoDaysToMakeBouquets {
    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2};
        int m = 3;
        int k = 1;

        System.out.println(binarySearch(arr, m, k));
    }

    static int binarySearch(int[] arr, int m, int k){
        
        int start = 0;
        int end = Arrays.stream(arr).max().getAsInt();
        int minDays = 0;

        if(arr.length < (m*k)) return -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(findMinDays(arr,mid,m,k)){
                minDays = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return minDays;
    }

    static boolean findMinDays(int[] arr, int day, int m, int k){
        
        int count = 0;
        int noBouquets = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= day){
                count ++;
            }else{
                noBouquets += count / k;    
                count = 0;
            }
        }
        noBouquets += count / k;

        return noBouquets >= m;
    }
}
