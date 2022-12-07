package Chapter1StringAndMath.Exercise23;

//#23 - Applying indentation
public class Exercise23 {

    public static void main(String[] args) {
        //From jdk12 we can use String.indent(int n)
        String days = "Sunday\n" + "Monday\n" + "Tuesday\n" + "Wednesday\n" + "Thursday\n" + "Friday\n" + "Saturday\n";
        regularIndentation(days); //indent with n spaces
    }

    private static void regularIndentation(String s) {
        System.out.println(s.indent(10));
    }

}
