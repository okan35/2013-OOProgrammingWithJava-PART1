import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String answer = reader.nextLine();
        System.out.println("Length of the part: ");
        int answerLen = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + answer.substring(answer.length() - answerLen, answer.length()));
        
    }
}
