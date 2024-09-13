
// Example4: Grade  using switch statement
import java.util.Scanner;

public class exampleFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = scanner.nextInt();

        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            case 4:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                scanner.close();
        }
    }
}
