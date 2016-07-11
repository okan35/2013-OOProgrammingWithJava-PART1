
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number");
        double firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number");
        double secondNumber = Integer.parseInt(reader.nextLine());
        
        double sum = firstNumber / secondNumber;
        
        System.out.println("Division:" + firstNumber +" / " + secondNumber + " = " + sum);
        



// Implement your program here. Remember to ask the input from user.
    }
}
