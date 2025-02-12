import java.util.Scanner;

public class DieRoll {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.close();

        int maxRoll = Math.max(Y, W);
        int favorableOutcomes = 6 - maxRoll + 1;
        int denominator = 6;
        
        int gcd = gcd(favorableOutcomes, denominator);
        System.out.println((favorableOutcomes / gcd) + "/" + (denominator / gcd));
    }
}
