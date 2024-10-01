class Person {
    // Private variable - data is encapsulated
    private String name;

    // Public method to set the value of the private variable
    public void setName(String name) {
        this.name = name;
    }

    // Public method to get the value of the private variable
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jeff Geoff"); // Setting value using setter
        System.out.println(person.getName()); // Accessing value using getter
    }
}
