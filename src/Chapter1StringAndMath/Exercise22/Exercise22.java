package Chapter1StringAndMath.Exercise22;

//#22 - Finding the longest common prefix
public class Exercise22 {

    public static void main(String[] args) {
        String[] stringArr = {"abc", "abcde", "ab", "abcdefg", "abcdefghi"};
        System.out.println(longestCommonPrefix(stringArr));
    }

    private static String longestCommonPrefix(String[] stringArr) {

        if (stringArr.length == 1) {
            return stringArr[0];
        }

        int firstLen = stringArr[0].length();

        for (int i = 0; i < firstLen; i++) {
            char charToCompare = stringArr[0].charAt(i);

            for (int j = 1; j < stringArr.length; j++) {
                if (i >= stringArr[j].length() || stringArr[j].charAt(i) != charToCompare) {
                    return stringArr[0].substring(0, i);
                }
            }
        }

        return stringArr[0];
    }
}
