public class FindIndexofFirsOccurrenceInString {
    public static void main(String[] args) {
        String haystack = "sedbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String hayStack, String needle){
        
        for(int i = 0, j = needle.length(); j <= hayStack.length(); i++, j++){
            if(hayStack.substring(i,j).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
