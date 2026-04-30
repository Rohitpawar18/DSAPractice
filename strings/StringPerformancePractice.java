import java.util.*;
public class StringPerformancePractice {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        String name = "Rohit Pawar";
        System.out.println(Arrays.toString(name.toCharArray()));

    }
}
