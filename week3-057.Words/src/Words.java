
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String answer = reader.nextLine();
            words.add(answer);
            if (answer.isEmpty()) {
                for (String word : words) {
                    System.out.println("You typed these words: " + word);
                    

                }
                break;

            }

        }

    }
}
