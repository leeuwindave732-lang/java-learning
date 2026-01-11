public class miniProject5 {
    public static void main(String[] args) {
        // print the multiplication table of using a loop
        int number = 5; 
        for ( int i = 1; i <= 10; i++ ) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }

        // use a while loop to sum numbers from 1 to 10
        int sum = 0;
        int num = 1;
        while ( num <= 10 ) {
            sum += 1;
            num++;
        }
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);


        // use a do while to print 1 to 5
        int n = 1;
        do {
            System.out.println("Print numbers 1 - 5: " + n);
            n++;
        } while ( n <= 5);
    }
}
