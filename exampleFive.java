//Question 3: Write a Java program that prints all even numbers
// from 1 to 20 using a for loop.
public class exampleFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
