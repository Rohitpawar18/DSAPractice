public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        // int[] nums = {3,4,5,1,2};
        // int[] nums = {4,5,6,7,0,1,2};
        // int[] nums = {11,13,15,17};
        int[] nums = {1};
        System.out.println(findPivotWithDuplicates(nums));
    }

    static int findMinimum(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            if(nums[start] <= nums[end]) return nums[start];
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return nums[mid + 1];
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            if(nums[start] >= nums[mid]){
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

        while(start <= end){
            if(arr[start] < arr[end]) return arr[start];
            int mid = start + (end - start) / 2;
           
            if(mid < end && arr[mid] > arr[mid + 1]){
                return arr[mid + 1];
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return arr[mid];
            }
            
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(start < end && arr[start]>arr[start+1]){
                    return arr[start + 1];
                }
                start++;
                if(end > start && arr[end] < arr[end-1]){
                    return arr[end];
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return arr[0];
    }
    
}
