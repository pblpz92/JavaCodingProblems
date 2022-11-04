package Chapter1StringAndMath.Exercise4;

//#4 - Checking if a string contains only digits
public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(isOnlyDigits("12345678"));
        System.out.println(isOnlyDigits("12aaaa345678"));
    }

    private static boolean isOnlyDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static boolean isOnlyDigits2(String s) {//Using java 8 functional style
        return !s.chars().anyMatch(n -> !Character.isDigit(n));
    }

    private static boolean isOnlyDigits3(String s) {//Using RegEx
        return s.matches("[0-9]+");
    }


    }
