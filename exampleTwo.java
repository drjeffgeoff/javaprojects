
// UserInput
import java.util.Scanner;

public class exampleTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for the user's name
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        // Asking for the user's age
        System.out.println("How old are you?");
        int age = sc.nextInt();

        // Asking for the user's favorite color
        System.out.println("What is your favorite color?");
        String color = sc.next();

        // Asking for the user's favorite food
        System.out.println("What is your favorite food?");
        String food = sc.next();

        // Asking for the user's favorite movie
        System.out.println("What is your favorite movie?");
        String movie = sc.next();

        // Asking for the user's favorite book
        System.out.println("What is your favorite book?");

        // Print out the user's information
        System.out.println("Your name is " + name + ", you are " + age + " years old");
        System.out.println("Your favorite color is " + color + ", and your favorite food is " + food);
        System.out.println("Your favorite movie is " + movie + ", and your favorite book is " + sc.nextLine());

        // Closing the scanner
        sc.close();
    }
}
