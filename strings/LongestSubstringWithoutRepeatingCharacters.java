import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s){
        
        int i = 0, j = 0, max = 0;
        HashSet<Character> result = new HashSet();

        while(j < s.length()){
            if(!result.contains(s.charAt(j))){
                result.add(s.charAt(j));
                j++;
                max = Math.max(result.size(), max);
            }else{
                result.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
