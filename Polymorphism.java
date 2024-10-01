class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        System.out.println(operations.add(5, 10)); // Calls int version
        System.out.println(operations.add(5.5, 10.5)); // Calls double version
    }
}
