
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First : ");
        int numberFirst = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second : ");
        int numberSecond = Integer.parseInt(reader.nextLine());
        
        
        while (numberFirst<=numberSecond) {
            System.out.println(numberFirst);
            numberFirst++;
            
        }
        
        if (numberFirst < numberSecond) {
            System.out.println("   ");
        }
        
        
        
    }
}
