package Chapter1StringAndMath.Exercise8;

//#8 - Remove all the whitespaces
public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(removeBlanks("Please remove the whitespaces"));
    }

    private static String removeBlanks(String s) {//Using a regular expression
        return s.replaceAll("\\s", "");
    }

}
