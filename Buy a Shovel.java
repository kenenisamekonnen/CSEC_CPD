import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();  // Price of one shovel
        int r = scanner.nextInt();  // The special r-burle coin
        scanner.close();

        int x = 1; // Start with 1 shovel

        while (true) {
            int totalCost = x * k;
            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}
