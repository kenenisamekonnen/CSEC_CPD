import java.util.HashSet;
import java.util.Scanner;

public class IsYourHorseShoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> colors = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            colors.add(scanner.nextInt());
        }
        scanner.close();


        System.out.println(4 - colors.size());
    }
}
