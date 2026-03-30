public class SearchInMountainArray {
    public static void main(String ar[]){
        int[] arr = {0,5,3,1};
        int target = 1;
        int result = searchTarget(arr,target);
        System.out.println(result);
    }

    static int searchTarget(int[] arr, int target){
        
        int peak = searchPeakIndex(arr);
        int firstTry = BinarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        
        return BinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int searchPeakIndex(int[] arr){
        int start = 0; 
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int BinarySearch(int[] arr, int target, int start, int end){
        
        boolean isASC = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end - start) / 2;
            
            if(target == arr[mid]) return mid;
            if(isASC){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
