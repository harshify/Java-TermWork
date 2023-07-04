package HARSH40;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q28 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the file name as a command-line argument.");
            return;
        }

        String filename = args[0];

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                characterCount += line.length();
                wordCount += countWords(line);
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Character Count: " + characterCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Line Count: " + lineCount);
        System.out.println("\nEnd of the program\n\n");
		System.out.println("************************\n");
		System.out.println("Implemented by- Harsh Raj Mishra\t Class Roll no-40\t CSE(4)E");
		System.out.println("\n************************");
    }

    public static int countWords(String line) {
        if (line == null || line.isEmpty()) {
            return 0;
        }

        String[] words = line.trim().split("\\s+");
        return words.length;
    }
}