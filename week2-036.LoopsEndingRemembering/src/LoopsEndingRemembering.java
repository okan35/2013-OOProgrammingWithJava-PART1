import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int typedNumber = 0, sum = 1, counter = -1, evenNumbers = 0;
        
        while (true) {
            typedNumber = Integer.parseInt(reader.nextLine());
            sum = sum + typedNumber;
                              
            counter++;
            if (typedNumber % 2 == 0) 
                    evenNumbers++;
            
           if (typedNumber < 0 ) {
                System.out.println("Thank you and see you again!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers :" + counter );
                System.out.println("Average: " + sum*1.0 / counter);
                
                System.out.println("Even Numbers : " + evenNumbers);
                
           
                System.out.println("Odd numbers : " +( counter - evenNumbers));
                break;
            }                    
        }
      
        

    }
}
