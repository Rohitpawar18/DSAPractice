public class MinimumValuetoGetPositiveStepbyStepSum {
    public static void main(String[] args) {
        int[] nums = {1,-2,-3};
        System.out.println(minStartValue(nums));
    }

    public static int minStartValue(int[] nums){
        int sum = 0;
        int minPrifixSum = 0;

        for(int num : nums){
            sum += num;
            minPrifixSum = Math.min(minPrifixSum, sum);
        }

        return minPrifixSum < 0 ? Math.abs(minPrifixSum) + 1 : 1;
    }
}
