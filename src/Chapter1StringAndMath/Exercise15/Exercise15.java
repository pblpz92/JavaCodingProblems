package Chapter1StringAndMath.Exercise15;

import java.util.Arrays;

//#15 - Sorting an array of strings by length
public class Exercise15 {

    public static void main(String[] args) {
        String[] stringArray = {"asdf", "as", "adfsadfe", "asdfvlaie", "afksdhsakfdak"};
        printArray(stringArray);
        sortByLength(stringArray);
        printArray(stringArray);
    }

    private static void sortByLength(String[] s) {//Arrays.sort using a lambda expression as second parameter
        Arrays.sort(s, (str1, str2) -> str1.length()-str2.length());
    }

    private static void printArray(String[] s) {
        for (String string: s) {
            System.out.println(string);
        }
        System.out.println("-------");
    }

}
