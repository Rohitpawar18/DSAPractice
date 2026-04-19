import java.util.*;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> result = new ArrayList<>();
        
        int i = 0;
        while(i < nums.length){
            
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != (index + 1)){
                result.add(nums[index]);
            }
        }
        return result;
    }
}
