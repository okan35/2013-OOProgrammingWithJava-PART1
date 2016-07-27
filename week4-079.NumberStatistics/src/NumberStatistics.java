
import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumber;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumber = 0;
    }

    public void addNumber(int number) {

        this.amountOfNumber++;
        this.sum += number;

    }

    public int amountOfNumbers() {

        return this.amountOfNumber;

    }

    public int sum() {

        return this.sum;
    }

    public double average() {

        if (this.amountOfNumber == 0) {
            return 0;
        }

        return (double)(this.sum*1.0)/this.amountOfNumber;
        
    }

}
