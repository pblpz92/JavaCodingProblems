package Chapter1StringAndMath.Exercise6;

//#6 - Counting the occurrences of a certain character
public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(occurrences('a', "aaaaabcde"));
        System.out.println(occurrences2('b', "aabaaabcde"));
        System.out.println(occurrences3('s', "sss123"));
    }

    private static int occurrences(char c, String s) {
        return s.length() - s.replace(String.valueOf(c), "").length();
    }

    private static int occurrences2(char c, String s) {
        int occurrences = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                occurrences++;
            }
        }
        return occurrences;
    }

    private static int occurrences3(char c, String s) {//Java 8 functional style
        return (int)s.chars()
                .filter(x -> x == c)
                .count();
    }
}
