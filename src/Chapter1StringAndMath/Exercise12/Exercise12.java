package Chapter1StringAndMath.Exercise12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//#12 - Removing duplicate characters
public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(removeDuplicateCharaceters("aabbcc"));
        System.out.println(removeDuplicateCharaceters2("aabbcc"));
        System.out.println(removeDuplicateCharaceters2("aabbcc"));
    }

    private static String removeDuplicateCharaceters(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (sb.indexOf(String.valueOf(s.charAt(i))) == -1) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    private static String removeDuplicateCharaceters2(String s) {//Using HashSet to avoid duplicates
        StringBuilder sb = new StringBuilder();
        Set uniqueChars = new HashSet();

        for (int i = 0; i < s.length(); i++) {
            if (uniqueChars.add(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    private static String removeDuplicateCharaceters3(String s) {//Using java 8 functional style
        return Arrays.asList(s.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }

}
