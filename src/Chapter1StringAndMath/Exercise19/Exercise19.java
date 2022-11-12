package Chapter1StringAndMath.Exercise19;

//#19 - Writting multiline text
public class Exercise19 {

    private static final String LS = System.lineSeparator();

    public static void main(String[] args) {
        //Since Java 12 you can use a triple quote notation like """multiline text goes here"""
        //Both solutions rely on use of System.lineSeparatpr();

        //Using string format
        String multiLine = String.format("%s" + LS + "%s" + LS + "%s", "Line 1", "Line 2", "Line 3");
        System.out.println(multiLine);
        System.out.println("-------------");

        //Using java 8 String.Join()
        String multiLine2 = String.join(LS, "Line 1", "Line 2", "Line 3");
        System.out.println(multiLine2);

    }
}
