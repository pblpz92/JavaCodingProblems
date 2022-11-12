package Chapter1StringAndMath.Exercise17;

//#17 - Counting substring occurrences
public class Exercise17 {
    public static void main(String[] args) {
        System.out.println(countingSubstrings("111", "1111"));
    }

    private static int countingSubstrings(String container, String contained) {//Slicing the container word
        int count = 0;

        while (container.indexOf(contained) != -1) {
            container = container.substring(container.indexOf(contained) + contained.length());
            count++;
        }

        return count;
    }
}
