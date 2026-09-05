import java.util.*;
public class ThreeSumClosest {
  public static void main(String[] args) {
    int[] nums = {-1,0,1,2,-1,-4};
    int target = 4;

    System.out.println(threeSumClosest(nums, target));
  }

  public static int threeSumClosest(int[] nums, int target){

    Arrays.sort(nums);
    int resultSum = nums[0] + nums[1] + nums [2];
    int minDiff = Integer.MAX_VALUE;

    for(int i = 0; i < nums.length - 2; i++){
      int left = i + 1;
      int right = nums.length - 1;

      while(left < right){
          int sum = nums[i] + nums[left] + nums[right];

          if(sum == target){
            return target;
          }
          
          if(sum < target){
            left++;
          }else{
            right--;
          }

          int diffToTarget = Math.abs(sum - target);
          if(diffToTarget < minDiff){
            resultSum = sum;
            minDiff = diffToTarget;
          }
      }
    }

    return resultSum;
  }
}
