public class miniProject4 {
    public static void main(String[] args) {
        int grades = 90;
        int day = 3;
        int day1 = 4;

        // if else grades
        if ( grades >= 75 ) {
            if ( grades >= 90 ) {
                System.out.println("Grade: A");
            } else if ( grades >= 80 ) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: C");
            }
        } else {
            System.out.println("Grade: F");
        }
        
        // Day using if else
        if ( day == 1) {
            System.out.println("The day is Monday");
        } else if ( day == 2) {
            System.out.println("The day is Tuesday");
        } else if ( day == 3 ) {
            System.out.println("The day is Wednesday");
        } else if ( day == 4 ) {
            System.out.println("The day is Thursday");
        } else if ( day == 5 ) {
            System.out.println("The day is Friday");
        } else if ( day == 6 ) {
            System.out.println("The day is Saturday");
        } else {
            System.out.println("The day is Sunday");
        }

        // Switch day
        String dayName = switch ( day1 ) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other day";
        };

        System.out.println(dayName);
    }
}
