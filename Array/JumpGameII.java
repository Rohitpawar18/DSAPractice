public class JumpGameII {
    public static void main(String ar[]){
        int[] nums = {2,3,1,1,4};
        

        System.out.println(jump(nums));
    }

    public static int jump(int[] nums){
        
        int totalJumps = 0, coverage = 0, lastJumpIdx = 0;

        if(nums.length == 1) return 0;

        for(int i = 0; i < nums.length; i++){
            coverage = Math.max(coverage, i + nums[i]);

            if(i == lastJumpIdx){
                lastJumpIdx = coverage;
                totalJumps++;

                if(coverage >= nums.length - 1){
                    return totalJumps;
                }
            }
        }

        return totalJumps;
    }
}
