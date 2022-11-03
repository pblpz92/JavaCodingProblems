package Chapter1StringAndMath.Exercise1;

import java.util.HashMap;
import java.util.Map;

//#1 - Counting duplicate characters
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(countDuplicateCharacters("aabbCcc"));
    }

    public static Map<Character, Integer> countDuplicateCharacters(String s) {
        //Creating a hashmap to avoid adding duplicates characters
        Map<Character, Integer> result = new HashMap<>();

        //Transform the string to a char array and iterate it.
        for (char c: s.toCharArray()) {
            //If not present add 1 as value, if present add 1 to current value.
            result.compute(c, (k, v) -> v == null ? 1 : ++v);
        }
        return result;
    }
}
