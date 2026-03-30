public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {1, 7, 6, 2, 3, 4, 5};
        int k = 0;
        System.out.println("Maximum sum of a subarray of size "+k+" : "+findMaxSumSubarray(nums,k));
    }

    public static int findMaxSumSubarray(int[] nums, int k){
        
        if(nums == null || nums.length < k || k <= 0) throw new IllegalArgumentException("Invalid Input Array Or Window Size k");

        int currentWindow = 0;
        int maxSum = Integer.MIN_VALUE;

        // calculate the sum of first window
        for(int i = 0; i < k; i++) currentWindow += nums[i];

        maxSum = currentWindow;
        //slides the window accross the rest of the array
        for(int i = k; i < nums.length; i++){
            //add the new element entering the window from right
            currentWindow += nums[i];
            //subtract element leaving the window from the left
            currentWindow -= nums[i - k];

            //update the maximum sum
            maxSum = Math.max(maxSum, currentWindow);
        }

        return maxSum;
    }
}

