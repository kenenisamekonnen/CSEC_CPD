import java.util.Scanner;

public final class Lamik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        int years = 0;

        while (a <= b) {
            a *= 3; 
            b *= 2;
            years++;
        }

        System.out.println(years);
        scanner.close();
    }
}
