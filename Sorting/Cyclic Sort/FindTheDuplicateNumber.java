public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums){
        
        int i = 0;
        while(i < nums.length){
            
            if(nums[i] != (i + 1))
            {
                int correct = nums[i] - 1;

                if(nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }

        return -1;
    }
}
