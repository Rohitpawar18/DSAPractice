public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println("minimum length : "+minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums){
        int start = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int end = 0; end < nums.length; end++){
            sum += nums[end];

            while(sum >= target){
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
