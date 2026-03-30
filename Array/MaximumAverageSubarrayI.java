public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("Maximum Average Subarray : "+maximumAverageSubarray(nums, k));
    }

    public static double maximumAverageSubarray(int[] nums, int k){
        
        int currentWindow = 0;
        
        for(int i = 0; i < k; i++){
            currentWindow += nums[i];
        }

        int maxSum = currentWindow;
        
        for(int i = k; i < nums.length; i++){
            currentWindow += nums[i];

            currentWindow -= nums[i - k];

            maxSum = Math.max(maxSum, currentWindow);
        }
        return (double) maxSum / 4;
    }
}
