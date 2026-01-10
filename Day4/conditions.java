public class conditions {
    public static void main(String[] args) {
        // conditional ( if, switch )
        int score = 85;

        // if-else example
        if ( score >= 90 ) {
            System.out.println("Wow, Nice Job1");
        } else if ( score >= 75 ) {
            System.out.println("You need to do better than that");
        } else {
            System.out.println("You failed");
        }

        // switch example
        int day = 3;
        switch(day) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}