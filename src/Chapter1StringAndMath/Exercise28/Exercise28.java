package Chapter1StringAndMath.Exercise28;

//# - Converting into a number by an unsigned conversion
public class Exercise28 {

    public static void main(String[] args) {
        //Convert the given signed int into long via an unsigned conversion

        int signed = Integer.MIN_VALUE;
        long result = Integer.toUnsignedLong(signed);
        System.out.println(result);
    }
}
