import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name :");
        String answer = reader.nextLine();
        System.out.println("Last character : " + lastCharacter(answer) );
        
    }
    
    public static char lastCharacter(String text) {
        
        int name = text.charAt(text.length() - 1);
                
        return (char)name;
        
    }
}
