class OrderAgnosticBS{
    public static void main(String ar[]){
        // int[] arr = {-76,-65,-34,-21,-11,5,7,12,23,43,65,77};
        // int target=77;

        int[] arr = {90,87,65,45,44,32,21,11,-1,-4,-55,-66,-77}; // desceding
        int target=-4;

        int result = orderAgnosticBS(arr, target);
        if(result != -1){
            System.out.println("Target Found At "+result+" Index");
        }else{
            System.out.println("Target Not Found");
        }
    }

    static int orderAgnosticBS(int[] arr, int target){
        
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) return mid;

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1; 
                }else if(target > arr[mid]){
                    start = mid + 1; 
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