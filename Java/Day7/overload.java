package Day7;
public class overload {
    public static void main(String[] args) {
        // overload area methods
        System.out.println("Area (int, int):" + area(5,10));
        System.out.println("Area (double, double):" + area(5.1, 5.2));
        System.out.println("Area (int, int, int):" + area(10,20,20));

        // overload print method
        printMessage("Hello");
        printMessage("Hello", 3);
    }

        // Rectangle area
    public static int area(int width, int height) {
        return width * height;
    }

        // Rectangle area with double
    public static double area(double width, double height) {
        return width * height;
    }

        // Rectangle area with depth
    public static int area(int width, int height, int depth) {
        return width * height * depth;
    }

        // print single message
    public static void printMessage(String msg) {
        System.out.println(msg);
    }

        // print multiple message
    public static void printMessage(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}
