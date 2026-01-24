import java.util.Scanner;
public class except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter Operator: (+, -, *, /,): ");
            String ope = sc.next();

            switch(ope) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if ( num2 == 0 ) {
                        System.out.println("Number cannot be divided by zero");
                    } else {
                        System.out.println((double)num1 / num2);
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}
