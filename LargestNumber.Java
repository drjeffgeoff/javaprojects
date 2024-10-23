import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value
        
        System.out.println("Enter 20 integers:");

        // Loop to read 20 integers
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            
            // Update max if the current number is greater than the previous max
            if (num > max) {
                max = num;
            }
        }
        
        // Output the largest number
        System.out.println("The largest number is: " + max);
    }
}
