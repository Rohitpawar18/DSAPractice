import java.util.*;
public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat dog dog";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s){
        
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        if(arr.length != pattern.length()) return false;

        for(int i = 0; i < pattern.length(); i++){
            char original = pattern.charAt(i);
            String replacement = arr[i];

            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original, replacement);
                }else{
                    return false;
                }
            }else{
                // String mappedChar = map.get(original);
                if(!map.get(original).equals(replacement)) return false;
            }
        }
        
        return true;
    }
}
