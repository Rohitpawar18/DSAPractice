public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;

        System.out.println(splitArray(nums, k));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while(start < end){
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > mid){
                    //you cannot add this in this subarray, make new one
                    //you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            }else{
                end = mid;
            }

        }

        return end; // return start or end beacuse start == end
    }
}
