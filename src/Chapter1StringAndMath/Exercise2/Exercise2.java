package Chapter1StringAndMath.Exercise2;

//#2 - Finding the first non repeated character
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatedChar("abcdefghi"));
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
}
