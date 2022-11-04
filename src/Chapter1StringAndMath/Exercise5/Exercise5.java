package Chapter1StringAndMath.Exercise5;

import java.util.Arrays;
import java.util.List;

//#5 - Counting vowels and consonants
public class Exercise5 {

    private static List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        countingVowelsAndConsonants("Consonant");
    }

    private static void countingVowelsAndConsonants(String s) {
        int vowelCount = 0, consonantCount = 0;

        for (char c: s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (vowels.contains(c)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Word: " + s + "\nVowels: " + vowelCount + "\nConsonants: " + consonantCount);
    }
}
