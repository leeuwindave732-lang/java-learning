import java.util.Scanner;
public class miniProject11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask user for index
        int[] array = {1, 2,3,4,5};
        try {
            System.out.print("Enter an index number: ");
            int number = sc.nextInt();
            System.out.println("Number " + number + " Is in indexed of " + array[number]);
        // Handle array out-of-bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            // Add custom error messages
            System.out.println("Index not found");
        } finally {
            sc.close();
        }

    }
}
