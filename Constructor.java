class Car {
    String model;

    // Parameterized constructor
    Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        System.out.println("Car model: " + car.getModel());
    }
}
