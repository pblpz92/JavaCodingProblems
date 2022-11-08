package Chapter1StringAndMath.Exercise13;

import java.util.regex.Pattern;

//#13 - Removing a given character
public class Exercise13 {
    public static void main(String[] args) {
        System.out.println(removingChar('a', "patata"));
        System.out.println(removingChar2('a', "patata"));
    }

    private static String removingChar(char a, String s) {//Using Pattern.quote to incluse special characters
        return s.replaceAll(Pattern.quote(String.valueOf(a)), "");
    }

    private static String removingChar2(char a, String s) {//With srtingbuilder
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();

        for (char c: charArray) {
            if (c != a) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
