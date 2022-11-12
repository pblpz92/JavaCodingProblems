package Chapter1StringAndMath.Exercise20;

import java.util.Random;

//#20 - Concatenating the same String n times
public class Exercise20 {
    public static void main(String[] args) {

        System.out.println(concatenateString("Concatenate me!", new Random().nextInt(10) + 1));
    }

    private static String concatenateString(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(s + " ");
        }

        return sb.toString();
    }

}
