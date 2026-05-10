import java.util.*;
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";

        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t){
        
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> charMapping = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!charMapping.containsKey(original)){
                if(!charMapping.containsValue(replacement)){
                    charMapping.put(original, replacement);
                }else{
                    return false;
                }
            }else{
                char mappedChar = charMapping.get(original);
                if(mappedChar != replacement){
                    return false;
                }
            }
        }

        return true;
    }
}


// Time Complexity = O(n)
// Space Complexity = O(1)