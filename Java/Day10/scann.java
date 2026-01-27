package Day10;
import java.util.Scanner;

public class scann {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // name
        System.out.print("Enter your name:");
        String name = sc.nextLine();

        // age 
        System.out.print("Enter your age:");
        int age = sc.nextInt();

        // average
        System.out.print("Enter your average grades:");
        double average = sc.nextDouble();

        System.out.println("Name:" + name + " Age:" + age + " Average:" + average);
        
        sc.close();
    }
}
