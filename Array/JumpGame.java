public class JumpGame {
    public static void main(String ar[]){
        int[] nums = {1,2,4,1,1,0,2,5}; // true
        // int[] nums = {1,2,3,1,1,0,2,5}; // false

        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums){
        
        int max = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(i > max) return false;

            max = Math.max(max, i + nums[i]);
        }

        return true;
    }
}
