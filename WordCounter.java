package Programs;
import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        // Define new variables and objects
        Scanner scan = new Scanner(System.in);
        int total_words = 1; // Instantiate total number of words
        String text = "";

        // Ask for user input
        System.out.println("Please enter your text here:\n");
        text = scan.nextLine();

        // while loop to go through all the words
        int i = 0; // Instantiate loop variable
        while (i < text.length()) {
            // check if the current character is a space and if the next is a character
            if ((((text.charAt(i))) == ' ') && (text.charAt(i+1) != ' ')){
             total_words++; // add 1 to word count
            }
            i++; // add 1 to loop variable
        }

        // Output total word count
        System.out.println("The total number of words in your text is: " + total_words);
        scan.close();
    }
}
