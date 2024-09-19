public class exampleEight {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 1) { // Base case
            return 1;
        } else { // Recursive case
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Call the recursive method and print the result
        int result = factorial(5);
        System.out.println("The factorial of 5 is: " + result); // Output: The factorial of 5 is: 120
    }
}
