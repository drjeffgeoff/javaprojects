import java.util.Arrays; // Importing the Arrays class

public class ArraySort {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = { 42, 15, 8, 23, 4 };

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

}
