import java.util.*;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String ar[]) {

        int[] arr = { 1 };
        System.out.println(canMakeArithmeticProgression(arr));
    }

    static boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        int diff = 0;
        if (arr.length > 1)
            diff = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != diff) {
                return false;
            }
        }
        return true;
    }
}
