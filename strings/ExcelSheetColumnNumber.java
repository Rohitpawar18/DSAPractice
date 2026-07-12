public class ExcelSheetColumnNumber{
    public static void main(String[] args) {
        String columnTitle = "ZY";

        System.out.println(titleNumber(columnTitle));
    }

    public static int titleNumber(String columnTitle){

        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            char ch = columnTitle.charAt(i);

            result = result * 26 + (ch - 'A' + 1);
        }

        return result;
    }
}