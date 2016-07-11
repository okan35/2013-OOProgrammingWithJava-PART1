
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number ?");
        int i = 0;
        
        int b = Integer.parseInt(reader.nextLine());
        
        while(i < b) {
            i++;
            System.out.println(i);
        }
        
       
        
        
    }
}
