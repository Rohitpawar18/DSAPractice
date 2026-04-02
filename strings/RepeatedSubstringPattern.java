public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s){
        
        String t = s + s;

        return t.substring(1, t.length() - 1).contains(s);
    }
}
