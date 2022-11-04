package Chapter1StringAndMath.Exercise3;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

//#3 - Reversing letters of each word
public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(reverseLetters("Reverse me please"));
        //System.out.println(reverseLetters2("Reverse me please"));
    }

    private static String reverseLetters(String s) {
        StringBuilder reversedWords;
        StringBuilder result = new StringBuilder();

        String[] individualWords = s.split(" ");

        for (int i = 0; i < individualWords.length; i++) {
            reversedWords = new StringBuilder();
            reversedWords.append(individualWords[i]).reverse();
            result.append(reversedWords);
            result.append(" ");
        }
        return result.toString();
    }

    private static String reverseLetters2(String s) {//Book solution. Java 8 functional style
        return Pattern.compile(" +").splitAsStream(s)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

}
