import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);

        String left = strs[0];
        String right = strs[strs.length - 1];

        for(int i = 0; i < Math.min(left.length(), right.length()); i++){
            if(left.charAt(i) != right.charAt(i)){
                return ans.toString();
            }
            ans.append(left.charAt(i));
        }
        return ans.toString();
    }
}
