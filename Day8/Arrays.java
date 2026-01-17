public class Arrays {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5};

        // Access Elements
        System.out.println(numbers[0]); // 1

        // modify element
        numbers[2] = 10;

        // Loop Using for
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Loop using for-each
        for (int num: numbers) {
            System.out.println(num);
        }
    }
}