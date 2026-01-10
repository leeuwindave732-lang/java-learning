public class miniProject3 {
    public static void main(String[] args) {
        int length = 1;
        int width = 1;

        int area = length * width;
        int perimeter = 2 * (length + width);

        while ( area <= 50) {
            System.out.println("Length: " + length + ", Width: "+ width);
            System.out.println("Area: " + area + ", Perimeter: " + perimeter);
            length++;
            width++;
            area = length * width;
            perimeter = 2 * (length + width);
            
        } 
    }
}