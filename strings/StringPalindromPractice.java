public class StringPalindromPractice {
    public static void main(String[] args) {
        String s = "abcba";

        if(isPalindrom(s)){
            System.out.println(s + " String is palindrom");
        }else{
            System.out.println(s + " String is not palindrom");
        }
        
    }

    public static boolean isPalindrom(String str){
        if(str == null || str.length() == 0){
            return true;  // as per you to  put here true or false
        }
        str = str.toLowerCase();

        for(int i = 0; i <= str.length() / 2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
