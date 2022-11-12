package Chapter1StringAndMath.Exercise18;

import java.util.Arrays;

//#18 - Checking if two words are anagrams
public class Exercise18 {
    public static void main(String[] args) {
        System.out.println(isAnagram("hola".toLowerCase(), "halo".toLowerCase()));
        System.out.println(isAnagram("hola".toLowerCase(), "hal o".toLowerCase()));
    }

    private static boolean isAnagram(String w1, String w2) {

        if (w1.length() != w2.length()) {
            return false;
        }

        char[] w1ToArray = w1.toCharArray();
        Arrays.sort(w1ToArray);

        char[] w2ToArray = w1.toCharArray();
        Arrays.sort(w2ToArray);

        for (int i = 0; i < w1ToArray.length; i++) {
            if (w1ToArray[i] != w2ToArray[i]) {
                return false;
            }
        }

        return true;
    }

}
