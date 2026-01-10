public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic
        System.out.println("Sum: " + ( a + b));
        System.out.println("Remainder: " + (a % b));

        // Assignment
        a += 5; // a = 15
        
        // Comparison 
        System.out.println(a > b); // true

        // Logical
        boolean result = (a > b) && (b > 0);
        System.out.println("Logical AND: " + result); 

        // Increment / Decrement

        a++; // 16
        b--; // 2

        // Precedence
        System.out.println("Precedence: " + (a + b * 2)); 
    }
}


// Arithmetic operators: +, -, *, /, %

// Assignment operators: =, +=, -=, *=, /=

// Comparison operators: ==, !=, >, <, >=, <=

// Logical operators: &&, ||, !

// Increment & decrement: ++, --

// Operator precedence
