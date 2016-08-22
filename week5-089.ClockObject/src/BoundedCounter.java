public class BoundedCounter {

    private int value = 0;
    private int upperLimit;
    private int counter;

    public BoundedCounter(int upperLimit) {

        this.counter = counter;
        this.upperLimit = upperLimit;

        for (int counter = 0; counter < upperLimit; counter++) {
            System.out.println(counter);
        }

    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }

    }

    public String toString() {

        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }

    }

    public int getValue() {

        return this.value;
    }

    public void setValue(int setter) {

        if (0 < setter && setter <= this.upperLimit) {
            this.value = setter;
        }
    }
}
