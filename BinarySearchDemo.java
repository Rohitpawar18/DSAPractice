public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {-76,-65,-34,-21,-11,5,7,12,23,43,65,77};
        int target=-34;

        // int[] arr = {90,87,65,45,44,32,21,11}; // desceding
        // int target=11;

        int result = binarySearch(arr, target);
        if(result != -1){
            System.out.println("Target Found At "+result+" Index");
        }else{
            System.out.println("Target Not Found");
        }
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // int mid = (start+end) / 2; // might be possible that (start + end) excced the integer range
            int mid = start + (end - start) / 2;

            // if(target > arr[mid]){  // for descending order
            if(target < arr[mid]){
                end = mid - 1;
            // }else if(target < arr[mid]){    // for descending order
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                // target found
                return mid;
            }
        }

        return -1;
    }
}
