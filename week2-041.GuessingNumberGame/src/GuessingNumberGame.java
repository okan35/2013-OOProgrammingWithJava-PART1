
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number: ");
        int i = 0;
        while (true) {
            i++;
            int answer = Integer.parseInt(reader.nextLine());
          if (answer == numberDrawn) {
            System.out.println("Congratulations, your guess is correct!");
            break;  
        } else  if (answer < numberDrawn) {
            System.out.println("The number is greater, guesses made :" + i);
            
        } else {
            System.out.println("The number is lesser, guesses made :" + i);
            
        }
         }
            
            
        
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
