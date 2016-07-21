import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        
        String reversedText = "";
        int counter = 0;
        
        while (counter<text.length()) {
         reversedText = reversedText + text.charAt(text.length() - counter - 1);
         counter++;
        } if (text.equals(reversedText)) {
            return true;
        } 
        
       
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
