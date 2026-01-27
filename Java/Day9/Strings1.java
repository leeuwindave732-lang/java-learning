package Day9;
public class Strings1 {
    public static void main(String[] args) {
        // String
        String name = "Java";

        System.out.println(name.length()); // 4
        System.out.println(name.toUpperCase()); // JAVA
        System.err.println(name.toLowerCase()); // java
        System.out.println(name.substring(0, 2)); // ja

        // String Comparison
        String a = "test";
        String b = "test";
        System.out.println(a.equals(b)); // true


        // StringBuilder

        StringBuilder sb = new StringBuilder("Hello");

        sb.append("World"); // Add new string
        sb.insert(5, " "); // Add Space
        sb.replace(0, 5, "Hi"); // "Hello" -> "Hi"

        System.out.println(sb.toString()); // Hi World

    }
}