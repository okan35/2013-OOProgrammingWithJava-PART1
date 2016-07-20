
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> arrayer = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word");
            String answer = reader.nextLine();
            arrayer.add(answer);
            if (answer.isEmpty()) {
                Collections.sort(arrayer);
                System.out.println("You typed the following words");
                for (String arrayorder : arrayer) {
                    System.out.println(arrayorder);
                }
                break;

            }

        }
    }
}
