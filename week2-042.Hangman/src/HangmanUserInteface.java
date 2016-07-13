
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");
        
        

        // PROGRAM YOUR SOLUTION HERE
        while (hangman.gameOn()) {
            System.out.println("Type a command :");
            String answer = reader.nextLine();
            
            if (answer.equals("quit")) {
                System.out.println("Thank you for playing !");
                break;
            } else if (answer.equals("status")) {
                hangman.printStatus();
            } else if (answer.length() == 1) {
                hangman.guess(answer);
            } else if (answer.isEmpty()) {
                printMenu();
            }
            
            hangman.printMan();
            hangman.printWord();
            
        }
           
        
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
