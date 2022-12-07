package Chapter1StringAndMath.Exercise24;

//#24 - Transforming strings
public class Exercise24 {

    public static void main(String[] args) {
        //From java 12
        String s = "Hello";
        String j = s.transform(x -> x + " world!");
        System.out.println(j);
    }

}
