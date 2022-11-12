package Chapter1StringAndMath.Exercise16;

//#16 - Checking that a string contains a substring
public class Exercise16 {
    public static void main(String[] args) {
        System.out.println(containsSubstring("This is a string", "string"));
        System.out.println(containsSubstring2("This is a string", "sting"));
    }

    private static boolean containsSubstring(String container, String contained) {//Using string method contains
        return container.contains(contained);
    }

    private static boolean containsSubstring2(String container, String contained) {//Using string method indexOf
        return container.indexOf(contained) != -1;
    }
}
