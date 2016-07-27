
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order

        NumberStatistics sumAll = new NumberStatistics();       
        NumberStatistics evenAll = new NumberStatistics();
        NumberStatistics oddAll = new NumberStatistics();
        System.out.println("Type numbers: ");
        while (true) {
            int answer = Integer.parseInt(reader.nextLine());                    
            if (answer == -1) {                
                break;
            }
            sumAll.addNumber(answer);
            if (answer % 2 == 0) {
                evenAll.addNumber(answer);
            } else {
                oddAll.addNumber(answer);
            }
        }
        System.out.println("Sum: " + sumAll.sum());
        System.out.println("Sum of even: " + evenAll.sum());
        System.out.println("Sum of odd: " + oddAll.sum());
        
        
    }
}
