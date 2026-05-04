import java.util.*;

class InvalidAge extends Exception {
    public InvalidAge(String s) {
        super(s);
    }
}

public class userDefinedException {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new InvalidAge("Invalid age");
            } else {
                System.out.println("Valid age");
            }
        }
        catch (InvalidAge e) {
            System.out.println("Exception caught " + e.getMessage());
        }
    }

}
