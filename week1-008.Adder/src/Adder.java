
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        int sum = firstNumber + secondNumber;
        
        System.out.println("Sum of the numbers: " + sum);
        
        // Implement your program here. Remember to ask the input from user
    }
}
