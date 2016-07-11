
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points: ");
        int point = Integer.parseInt(reader.nextLine());
        
        if (point > 0 && point < 30) {
            System.out.println("Grade: Failed");
        } else if (point > 29 && point < 35) {
            System.out.println("Grade: 1");
        } else if (point > 34 && point < 40) {
            System.out.println("Grade: 2");
        } else if (point > 39 && point < 45) {
            System.out.println("Grade : 3");
        } else if (point > 44 && point < 50) {
            System.out.println("Grade : 4");
        } else if (point > 49 && point < 61) {
            System.out.println("Grade: 5");
        }
        
    }
}
