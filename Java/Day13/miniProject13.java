package Day13;
// Create a Car class
class Car {
// Fields: brand, model, price
    String Brand;
    String Model;
    int price;

// Constructor with parameters
    Car(String Brand, String Model, int price) {
        this.Brand = Brand;
        this.Model = Model;
        this.price = price;
    }

    void displayCarInfo() {
        System.out.println("================");
        System.out.println("Car Brand: " + Brand);
        System.out.println("Car Model: " + Model);
        System.out.println("Car Price: " + price);
    }

}

// Display car details
public class miniProject13 {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Civic", 100000);
        Car c2 = new Car("Toyoya", "Supra", 700000);

        c1.displayCarInfo();
        c2.displayCarInfo();
    }
}
