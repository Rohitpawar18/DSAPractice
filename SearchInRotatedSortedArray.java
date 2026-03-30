public class SearchInRotatedSortedArray {
    public static void main(String ar[]){
        int[] arr = {1};
        int target = 0;
        int result = searchTarget(arr,target);
        System.out.println(result);
    }

    static int searchTarget(int[] arr, int target){
        
        int pivot = findPivotWithDuplicates(arr);
        if(pivot == -1){
            return BinarySearch(arr, target, 0, arr.length - 1);
        }
        
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return BinarySearch(arr, target, 0, pivot - 1);
        }

        return BinarySearch(arr, target, pivot + 1, arr.length - 1);        
    }

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
                    return end - 1;
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

    static int BinarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start + (end - start) / 2;
            
            if(target == arr[mid]) return mid;
           
            if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
