// Create a Car class
// fields: brand, model, year

class Car {
    String brand;
    String model;
    int year;

    // method
    void displayCarInfo() {
        System.out.println("====================");
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }
}



public class miniProject12 {
    public static void main(String[] args) {
        // Create 2 car objects
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Supra";
        c1.year = 2018;

        Car c2 = new Car();
        c2.brand = "Honda";
        c2.model = "Civic";
        c2.year = 2025;

        c1.displayCarInfo();
        c2.displayCarInfo();
    }
}
