package HARSH40;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        int[] inputArray = getInputArrayFromUser();

        int[] result = removeDuplicates(inputArray);

        System.out.print("Input Array: ");
        printArray(inputArray);
        System.out.print("Output Array: ");
        printArray(result);
        System.out.println("\nEnd of the program\n");
		System.out.println("************************\n");
		System.out.println("Implemented by- Harsh Raj Mishra\t Class Roll no-40\t CSE(4)E");
		System.out.println("\n************************");
    }

    public static int[] getInputArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int length = scanner.nextInt();

        int[] inputArray = new int[length];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        return inputArray;
    }

    public static int[] removeDuplicates(int[] inputArray) {
        int n = inputArray.length;
        int[] result = new int[n];
        int resultSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < resultSize; j++) {
                if (inputArray[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[resultSize] = inputArray[i];
                resultSize++;
            }
        }

        int[] trimmedResult = new int[resultSize];
        System.arraycopy(result, 0, trimmedResult, 0, resultSize);

        return trimmedResult;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}