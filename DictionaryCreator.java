package HARSH40;
import java.util.Scanner;
public class DictionaryCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] dictionary = new int[26]; // Assuming only lowercase letters are considered

        for (int i = 0; i < inputString.length(); i++) {
            char letter = inputString.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                int index = letter - 'a';
                dictionary[index]++;
            }
        }

        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println("'" + letter + "': " + dictionary[i]);
            }
        }
        System.out.println("*****************************************************************");
        System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
        System.out.println("*****************************************************************");
    }
}
