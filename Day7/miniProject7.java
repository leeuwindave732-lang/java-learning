public class miniProject7 {
    public static void main(String[] args) {
        System.out.println("Factorial! (int): " + factorial(5));
        System.out.println("Factorial! (long): " + factorial(10L));

        System.out.println("Perimeter (int): " + perimeter( 10, 20));
        System.out.println("Perimeter (double): " + perimeter( 10.5, 20.2));
    }

    // Overload area method to calculate the perimeter instead of area
    public static int perimeter( int width, int height) {
        return 2 * ( width + height );
    }

    public static double perimeter( double width, double  height ) {
        return 2 * ( width + height );
    }

    // Overload factorial method to handle long input
    public static long factorial(int n) {
        long fact = 1;

            for ( int i = 1; i <= n; i++ ) {
                fact *= i;
            }
            return fact;
    }

    public static long factorial(long n) {
        long fact = 1;

            for ( long i = 1; i <= n; i++ ) {
                fact *= i;
            }
            return fact;
    }
}
