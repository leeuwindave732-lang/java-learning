package Day5;
public class Loops {
    public static void main(String[] args) {
        // for loop
        for ( int i = 1; i <= 5; i++ ) {
            System.out.println("For loop iteration " + i);
        }

        // while loop
        int count = 1;
        while ( count <= 5) {
            System.out.println("While loop iteration: " + count);
            count++;
        }

        // do-while loop
        int n = 1;
        do {
            System.out.println("Do-while iteration: " + n);
            n++;
        } while ( n <= 5);

        // break and continue
        for(int j = 1; j <= 5; j++) {
            if ( j == 3 ) continue; // skip iteration
            if ( j == 5 ) continue; // exit loop
            System.out.println("Loop with break/continue: " +j);
        }
    }
}
