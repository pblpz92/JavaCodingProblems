package Chapter1StringAndMath.Exercise11;

//#11 - checking if a string is a palindrome
public class Exercise11 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    private static boolean isPalindrome(String s) {//Using StrinBuilder reverse method
        return s.equals(new StringBuilder(s).reverse().toString());
    }

}
