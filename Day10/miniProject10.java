import java.util.Scanner;

public class miniProject10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for a sentence and count the number of words
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        int count = 0;
        
        if (!sentence.isEmpty()) {
            String[] words = sentence.split(" ");
            count = words.length;
        }

        System.out.println("The count of the words are: " + count);

        // Ask for user details (name, age, year) and print them 
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your year: ");
        int year = sc.nextInt();

        System.out.print("Name: " + name);
        System.out.print(" Age: " + age);
        System.out.println(" Year: " + year);

        
        // Ask user for 3 integers and print their sum
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        System.out.println("The sum is: " + (num1+num2+num3));


        sc.close();

    }
}
