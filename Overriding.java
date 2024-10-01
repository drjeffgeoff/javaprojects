class Animal {
    public void sound() {
        System.out.println("This is a generic animal sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Polymorphism at work
        animal.sound(); // Calls the overridden method in Dog class
    }
}
