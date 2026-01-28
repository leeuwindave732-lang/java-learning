package Day14;
// Create Car class with private fields: brand, model, price

class Car {
    private String brand;
    private String model;
    private int price;

// Add getters and setters
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }
    // Validate price > 0
    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Ang tindi mo naman mang barat boi");
        }
    }

    void displayCarInfo() {
        System.out.println("================");
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: " + price);
    }

    
}
// Display car info
public class miniProject14 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Honda");
        c1.setModel("Civic");
        c1.setPrice(-1000);
        c1.displayCarInfo();
    }
}
