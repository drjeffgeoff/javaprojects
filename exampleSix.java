//Question6: Write a Java program that asks for a password and allows the 
//user 3 attempts to input the correct password using a while loop.

import java.util.Scanner;

public class exampleSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "Joseph123";
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Enter the password: ");
            String input = scanner.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Success! Correct Password");
            } else {
                attempts--;
                System.out.println("Incorrect Password. Attempts remaining: " + attempts);

            }
            if (attempts == 0) {
                System.out.println("Account  blocked.");
            }
        }
        scanner.close();
    }
}
