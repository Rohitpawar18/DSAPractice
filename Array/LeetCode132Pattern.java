import java.util.Stack;
public class LeetCode132Pattern {
  public static void main(String[] ar){
    int[] nums = {1,2,3,4};

    if(find132pattern(nums)){
      System.out.println("True, There is a 132 pattern in this array!");
    }else{
      System.out.println("False, There is a 132 pattern not in this array!");
    }
  }

  public static boolean find132pattern(int[] nums){
    
    Stack<int[]> stack = new Stack<>();
    int curMin = nums[0];

    for(int i = 1; i < nums.length; i++){
      int n = nums[i];

      while(!stack.isEmpty() && n >= stack.peek()[0]){
        stack.pop();
      }

      if(!stack.isEmpty() && n < stack.peek()[0] && n > stack.peek()[1]){
        return true;
      }

      stack.push(new int[]{n, curMin});
      curMin = Math.min(curMin, n);
    }

    return false;
  }
}