
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int name_len = name.length();
        System.out.print("In reverse order: ");
        while (name_len >= 1) {
            System.out.print(name.charAt(name_len - 1));
            name_len--;
        }
    }
}
