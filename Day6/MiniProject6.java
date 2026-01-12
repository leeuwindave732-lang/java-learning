public class MiniProject6 {
    public static void main(String[] args) {
        // Create a method to calculate area of a rectangle
        int width = 1;
        int height = 1;

        while ( true ) {
            int rectangle = area(width, height);
            if ( rectangle > 50) break;

            System.out.println("Height:" + height + "Width:" + width + "=" + rectangle);
            height++;
            width++;
        }

        // Create a method to calculate factorial of a number
        int number = 5;
        long result = factorial(number);

        System.out.println(number + "!= " + result);      
    }

        public static int area( int width, int height) {
            return width * height ;
        }


        public static long factorial(int n) {
            long fact = 1;

            for ( int i = 1; i <= n; i++ ) {
                fact *= i;
            }
            return fact;
    }
}

