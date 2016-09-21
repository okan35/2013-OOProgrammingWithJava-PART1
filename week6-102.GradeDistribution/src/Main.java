
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grader = new Grade(scanner);
        
        grader.getScores();
        grader.gradeGiver();
        grader.gradePrint();

    }
}
