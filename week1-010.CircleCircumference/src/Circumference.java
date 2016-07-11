
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius:");
        int firstRadius = Integer.parseInt(reader.nextLine());
        
        double circleresult = 2 * Math.PI * firstRadius;
        
        System.out.println("Circumference of the circle:" + circleresult);
        // Program your solution here 
    }
}
