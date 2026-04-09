public class CeilingNumber{
    public static void main(String ar[]){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 5;
        // int[] arr = {18,16,14,9,5,3,2};
        // int target = 15;

        int result = CeilingNumberSearch(arr,target);
        if(result != -1){
            System.out.println("Ceiling Number is "+result);
        }else{
            System.out.println("Ceiling Number is Not Found !");
        }
    }

    static int CeilingNumberSearch(int[] arr, int target){
        
        int start = 0;
        int end = arr.length - 1;

        boolean isASC = arr[start] < arr[end];
        if(isASC){
            if(target > arr[end] || target < arr[start]) return -1;  //ascending
            // if(target < arr[start]) return -1;
        }else{
            if(target > arr[start] || target < arr[end]) return -1;  //descending
            // if(target < arr[end]) return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]) return arr[mid];
            if(isASC){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }
            }
        }

        return isASC ? arr[start] : arr[end];
    }
}