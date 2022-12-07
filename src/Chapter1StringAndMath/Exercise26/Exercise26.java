package Chapter1StringAndMath.Exercise26;

//#26 - Suming two large int/long values and operation overflow
public class Exercise26 {

    public static void main(String[] args) {

        int x = Integer.MAX_VALUE; //2147483647
        int y = Integer.MAX_VALUE;
        int z = x + y; //Unexpected value -2
        System.out.println(z);

        int z2 = Math.addExact(x, y); //Throws ArithmeticException, better than getting an unexpected value
        System.out.println(z2);
    }
}
