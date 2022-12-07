package Chapter1StringAndMath.Exercise29;

// #29 - Comparing two unsigned numbers
public class Exercise29 {

    public static void main(String[] args) {

        int result = Integer.compare(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(result); //-1 indicates that first parameter is smaller

        int result2 = Integer.compareUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(result2);//1 indicating that unsigned min value is greater than max value
    }
}
