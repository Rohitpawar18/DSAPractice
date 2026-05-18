public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b){
        
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int c = 0;
        int base = 2;

        StringBuilder sb = new StringBuilder();

        while(n1 >= 0 || n2 >= 0){
            int t1 = 0, t2 = 0, sum;
            if(n1 >= 0){
                t1 = a.charAt(n1--) - '0';
            }

            if(n2 >= 0){
                t2 = b.charAt(n2--) - '0';
            }

            sum = t1 + t2 + c;
            
            if(sum >= base){
                c = 1;
                sum -= base;
            }else{
                c = 0;
            }

            sb.append(sum);
        }

        if(c == 1){
            sb.append(c);
        }
        
        return sb.reverse().toString();
    }
}
