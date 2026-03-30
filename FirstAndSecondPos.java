public class FirstAndSecondPos {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target=8;

        int[] result = binarySearch(arr, target);
        System.out.println(result[0]+" "+result[1]);
    }
    
    static int[] binarySearch(int[] arr, int target){
        
        int[] ans = {-1,-1};
       
        ans[0] = search(arr, target, true);
        if(ans[0] != -1){
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    static int search(int[] arr, int target, boolean findFirstIndex){
        
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                ans =  mid;
                if(findFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
