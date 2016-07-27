
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private int passLength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        passLength = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String pass = "";

        while (i < passLength) {
            pass = pass + alphabet.charAt(random.nextInt(26));
            i++;
        }
        return pass;
    }

}

