public class ValidNumber{
    public static void main(String[] args) {
        String s = "e";
        System.out.println(isNumber(s));
    }

    public static boolean isNumber(String s){
        boolean digitseen = false, eseen = false, dotseen = false;
        int countPlusMinus = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            //check digit
            if(Character.isDigit(ch)) digitseen = true;
            
            //check plus/minus position
            else if(ch == '+' || ch == '-'){
                if(countPlusMinus == 2) return false;

                //sign allowed only at start or immediately after e/E
                if(i > 0 && (s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')) return false;
                
                if(i == s.length() -1) return false;

                countPlusMinus++;
            }

            //check dot position
            else if(ch == '.'){
                //only one dot not after e/E
                if(eseen || dotseen) return false;

                if(i == s.length() - 1 && !digitseen) return false;

                dotseen = true;
            }

            //check e/E position
            else if(ch == 'e' || ch == 'E'){
                // only one e/E and must come afte digit
                if(eseen || !digitseen || i == s.length() - 1) return false;

                eseen = true;
            }else{
                return false;
            }
        }
        
        return true;
    }
}