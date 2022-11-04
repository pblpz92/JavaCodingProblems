package Chapter1StringAndMath.Exercise2;

import java.util.LinkedHashMap;
import java.util.Map;

//#2 - Finding the first non repeated character
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatedChar("abcdefghi"));
        System.out.println(firstNonRepeatedChar2("abcdefghi"));
    }

    private static char firstNonRepeatedChar(String s) {
        for (int i = 0; i < s.length(); i++){
            boolean repeated = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    repeated = true;
                }
            }
            if (!repeated) {
                return s.charAt(i);
            }
        }
        return Character.MIN_VALUE;
    }


    private static char firstNonRepeatedChar2(String s) {//Book solution
        //Use a linkedhashmap. LinkedHashMap avoid duplicates and is an insertion-order list
        Map<Character, Integer> characterCount = new LinkedHashMap<>();

        for (char c: s.toCharArray()) {
            characterCount.compute(c, (k, v) -> v == null ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry: characterCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }
}
