//Ques24-
package HARSH40;
import java.util.Scanner;
public class ItemsList 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemCount = scanner.nextInt();
        scanner.nextLine();

        String[] items = new String[itemCount];
        double[] prices = new double[itemCount];

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter item " + (i + 1) + " name: ");
            items[i] = scanner.nextLine();

            System.out.print("Enter item " + (i + 1) + " price: ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.print("Enter the number of top items to display: ");
        int topCount = scanner.nextInt();

        getTopItems(items, prices, topCount);
        System.out.println("*****************************************************************");
        System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
        System.out.println("*****************************************************************");
    }

    public static void getTopItems(String[] items, double[] prices, int n) {
        if (items.length != prices.length) {
            System.out.println("Invalid input: Lengths of items and prices arrays are different");
            return;
        }

        for (int i = 0; i < n; i++) {
            int maxIndex = getMaxIndex(prices);
            if (maxIndex != -1) {
                System.out.println(items[maxIndex] + " " + prices[maxIndex]);
                prices[maxIndex] = Double.MIN_VALUE;
            }
        }
    }

    public static int getMaxIndex(double[] prices) {
        int maxIndex = -1;
        double maxPrice = Double.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxIndex = i;
                maxPrice = prices[i];
            }
        }
        return maxIndex;
    }
}

