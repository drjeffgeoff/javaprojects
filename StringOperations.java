public class StringOperations {
    public static void main(String[] args) {
        // Declaring and initializing two strings
        String firstName = "John";
        String lastName = "Doe";

        // Concatenation of two strings
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Comparing two strings
        boolean isEqual = firstName.equals(lastName);
        System.out.println("Are first and last names equal? " + isEqual);

        // Extracting a substring from the full name
        String subString = fullName.substring(0, 4); // Extracts "John"
        System.out.println("Substring: " + subString);
    }

}
