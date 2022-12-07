package Chapter1StringAndMath.Exercise21;

//#21 - Removing leading and trailing spaces
public class Exercise21 {
    public static void main(String[] args) {
        //Use the trim() function,  witch is designed for that purpose
        String s = "    Remove my spaces    ";
        s = s.trim();
        System.out.println(s);
    }

}
