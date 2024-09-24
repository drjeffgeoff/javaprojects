public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Declaring and initializing a 2D array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Accessing and printing elements of the 2D array
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
