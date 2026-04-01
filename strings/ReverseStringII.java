public class ReverseStringII {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s,k));
    }

    public static String reverseStr(String s, int k){
        
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i += 2 * k){
            
            int start = i;
            int end = Math.min(i + k - 1, arr.length - 1);

            while(start < end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        return new String(arr);
    }
}
