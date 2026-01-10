public class Variables {
    public static void main(String[] args) {
        int age = 18; // stores age ( whole number )
        double height = 5.7; // stores height ( number with decimal )
        boolean isStudent = true; // true or false value
        char grade = 'A'; // a single character
        String name = "Seiju"; // a word or sentence

        var inferredInt = 10; // automatically treated as int by compiler

        // type casting
        double newHeight = age; // implicit
        int roundHeight = (int) height; // explicit

        // print 
        System.out.println("Name: " + name + " Age: " + age);
        System.out.println("Student?: " + isStudent + " grade?: " + grade);
        System.out.println(inferredInt);
        System.out.println(newHeight);
        System.err.println(roundHeight);

    }
}