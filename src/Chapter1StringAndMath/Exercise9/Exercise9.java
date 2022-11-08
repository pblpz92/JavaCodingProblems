package Chapter1StringAndMath.Exercise9;

import java.util.Arrays;
import java.util.stream.Collectors;

//#9 - Joining multiple strings with a delimiter
public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(joiningStrings('-', "Join", "Me", "With", "Delimiter"));
        System.out.println(joiningStrings2('-', "Join", "Me", "With", "Delimiter"));
    }

    private static String joiningStrings(char c, String... s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length - 1; i++) {
            sb.append(s[i]);
            sb.append(c);
        }
        sb.append(s[s.length-1]);

        return sb.toString();
    }

    private static String joiningStrings2(char c, String... s) {//Using java 8
        return Arrays.stream(s, 0, s.length).collect(Collectors.joining(String.valueOf(c)));
    }
}
