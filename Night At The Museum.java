import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exhibit = scanner.next();
        scanner.close();

        int totalRotations = 0;
        char current = 'a';  

        for (char target : exhibit.toCharArray()) {
            int clockwise = Math.abs(target - current);
            int counterClockwise = 26 - clockwise;
            totalRotations += Math.min(clockwise, counterClockwise);
            current = target;  
        }

        System.out.println(totalRotations);
    }
}
