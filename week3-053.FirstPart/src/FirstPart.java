
import java.util.Scanner;
import javax.print.DocFlavor;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
            System.out.println("Type a word: ");
            String answer = reader.nextLine();
            System.out.println("Length of the first part: ");
            int answerLen = Integer.parseInt(reader.nextLine());
            System.out.println("Result: " + answer.substring(0,answerLen) );
            
            
            
        

    }
}
