public class ArrayRotationCount {
    public static void main(String[] args) {
        // int[] arr = {2,5,6,0,0,1,2};
        int[] arr = {3,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        // int pivot = findPivotWithDuplicates(arr);

        return pivot + 1;
    }

    //if elements not duplicate
    static int findPivot(int[] arr){
        int start = 0; 
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 case over here

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    //if elements are duplicates
    static int findPivotWithDuplicates(int[] arr){
        int start = 0; 
        int end = arr.length - 1;
        if(arr.length <= 1) return -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 case over here

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            

            //if element at middle, start,end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //Note : what is these elements at start and end were the pivot ?
                //check if start is pivot
                if(start < end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(end > start && arr[end] < arr[end-1]){
                    return end;
                }
                end--;
            }
            //left side is sorted, so pivot should be right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
