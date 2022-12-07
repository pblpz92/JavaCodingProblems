package Chapter1StringAndMath.Exercise25;

//#25 - Computing mix and max of two numbers
public class Exercise25 {

    public static void main(String[] args) {
        //Prior to java 8 we can use Math.min() and Math.max()
        System.out.println(Math.min(-8, 12));

        //From java 8 we can use wrapper classes
        System.out.println(Long.min(1234L, 4321L));
    }
}
