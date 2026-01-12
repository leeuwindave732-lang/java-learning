public class method {
    public static void main(String[] args) {
        int sum = add(5,10);
        System.out.println("Sum: " + sum);

        printMessage("Hello from Seiju");

        // Method overload

        System.out.println("Sum of 3 numbers: " + add(1, 2, 3));
    }
    
    // method with return value
    public static int add(int a, int b) {
        return a + b;
    }

    // void method
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Overloaded method
    public static int add(int a, int b, int c) {
        return a + b + c;  
    }

}

