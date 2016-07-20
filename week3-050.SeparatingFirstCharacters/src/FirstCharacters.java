import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name :");
        
        String name = reader.nextLine();
        
        if (name.length() >3 ) {
        char firstChar = name.charAt(0);
        char secondChar = name.charAt(1);
        char thirdChar = name.charAt(2);
        
        System.out.println("1. character: " + firstChar);
        System.out.println("2. character: " + secondChar);
        System.out.println("3. character: " + thirdChar);
        
        } else {
            name.isEmpty();
        }
        
    }
}
