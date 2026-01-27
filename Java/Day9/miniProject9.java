package Day9;
public class miniProject9 {
    public static void main(String[] args) {
        // Reversed a string using StringBuilder

        String word = "Seiju Hajime";
        StringBuilder rev = new StringBuilder();

        rev.append(word);

        rev.reverse();

        System.out.println(rev);

        // Count Vowels in a string
        int count = 0;
        String sentence = "Hi! My name is Leeuwin, I'm a Computer Science Student";

        for ( int i = 0; i < sentence.length(); i++ ) {
            char ch = sentence.charAt(i);
            switch (ch) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    count++;
                    break;
            }
        }
        System.out.println("Number of vowels in a a sentence:" + count );

        // Build a sentence by appending words in a loop
        String[] str = { "Hi, ", "My name ", "is Seiju" };
        StringBuilder strSentence = new StringBuilder();
        for ( String sen: str) {
            strSentence.append(sen);
        }

        System.out.println(strSentence);
    }
}
