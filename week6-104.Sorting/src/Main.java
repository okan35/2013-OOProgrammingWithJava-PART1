
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {

        int i = 0;
        while (true) {
            if (array[i] == smallest(array)) {
                break;
            }
            i++;
        }

        return i;

    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startIndex) {

        int indexOfSmallest = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }

        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {

        int change = array[index1];
        array[index1] = array[index2];
        array[index2] = change;

    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1 ; i++) {
            int a = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, a);

        }

    }
}
