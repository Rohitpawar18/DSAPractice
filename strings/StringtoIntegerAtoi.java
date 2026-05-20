public class StringtoIntegerAtoi {
    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s){
        s = s.trim(); //remove the leading spaces

        if(s.length() == 0) return 0;

        int i = 0;
        int result = 0;
        int sign = 1;

        if(s.charAt(i) == '-' ){
            sign = -1;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }

        while(i < s.length()){
            int digit = s.charAt(i) - '0';

            //check digit or not
            if(!(digit >= 0 && digit <= 9)){
                break;
            }

            if(result > (Integer.MAX_VALUE - digit) / 10){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
