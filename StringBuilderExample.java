public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending a string
        sb.append(" World");
        System.out.println("After append: " + sb.toString());

        // Inserting a string at a specific position
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb.toString());

        // Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Reversing again to restore original order
        sb.reverse();

        // Deleting a part of the string
        sb.delete(6, 16); // Deletes "Beautiful "
        System.out.println("After delete: " + sb.toString());
    }

}
