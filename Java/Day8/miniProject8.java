package Day8;
public class miniProject8 {
    public static void main(String[] args) {
        // Create an array of 5 test scores and calculate the average
        int[] grades = { 75, 88, 99, 89, 78};
        int sum = 0;
        
        for (int grade: grades) {
            sum += grade;
        }
        int average = sum / grades.length;
        System.out.println("The average is:" + average);

        // find the largest number in an array
        int[] largest = { 10, 20, 30};

        int max = largest[0];

        for ( int i = 0; i < largest.length; i++) {
            if ( largest[i] > max) {
                max = largest[i];
            }
        } 
        System.out.println(max);
        

        // create a 2d array representing a 3x3 grid and print it
        int [][] num = {
            { 1, 2, 3},
            { 4, 5, 6},
            { 7, 8, 9}
        };

        for ( int a = 0; a < num.length; a++ ) {
            for ( int b = 0; b < num[a].length; b++ ) { 
                    System.out.print(num[a][b] + " ");
                }
            System.out.println();
        }
    }
}
