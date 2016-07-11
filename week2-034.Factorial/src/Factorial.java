import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number :");
        int facNumber = Integer.parseInt(reader.nextLine());
        
        int sum = 1;
       
        int counter = 1;
        
        while(counter <= facNumber) {
            
            sum = sum * counter;
            counter++;
        }
        
        System.out.println(sum);

    }
}
