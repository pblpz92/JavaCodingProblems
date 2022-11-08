package Chapter1StringAndMath.Exercise14;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//#14 - Finding the character with the most appearances
public class Exercise14 {
    public static void main(String[] args) {

        System.out.println(mostAppearances("aabbbcc"));
    }

    public static Map.Entry<Character, Integer> mostAppearances(String s) {
        Map<Character, Integer> uniqueCharacters = new HashMap<>();
        char[] characters = s.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            char current = characters[i];

            if (!Character.isWhitespace(current)) {
                Integer appearances = uniqueCharacters.get(current);

                if (appearances == null) {
                    uniqueCharacters.put(current, 1);
                } else {
                    uniqueCharacters.put(current, ++appearances);
                }
            }
        }

        Integer maxAppearances = Collections.max(uniqueCharacters.values());
        Character maxChar = Character.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry: uniqueCharacters.entrySet()) {
            if (maxAppearances == entry.getValue()) {
                maxChar = (Character)entry.getKey();
            }
        }
        return Map.entry(maxChar, maxAppearances);
    }
}
