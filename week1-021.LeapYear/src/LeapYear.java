
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        int leapYear = 0;
        if ((year % 400) == 0) {
            leapYear = 1;
        } else if ((year % 100) == 0) {
            leapYear = 0;
        } else if ((year % 4) == 0) {
            leapYear = 1;
        }
        
        if (leapYear == 1) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
}
    }
}
