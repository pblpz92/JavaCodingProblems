package Chapter1StringAndMath.Exercise7;

//#7 Converting a String into a int long float or double
public class Exercise7 {

    private static final String TO_INT = "1234";
    private static final String TO_LONG = "1234";
    private static final String TO_FLOAT = "123.4F";
    private static final String TO_DOUBLE = "1234123.987";

    public static void main(String[] args) {
        System.out.println(Integer.valueOf(TO_INT));
        System.out.println(Long.valueOf(TO_LONG));
        System.out.println(Float.valueOf(TO_FLOAT));
        System.out.println(Double.valueOf(TO_DOUBLE));
    }
}
