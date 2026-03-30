class PeakIndexInMountainArray{
    public static void main(String ar[]){
        int[] arr = {};

        int result = searchPeakIndex(arr);
        System.out.println(arr[result] + " at " + result);
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
}