import java.util.Scanner;

public class ShaassAndOskols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] wires = new int[n];

        for (int i = 0; i < n; i++) {
            wires[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            int wireIndex = scanner.nextInt() - 1;
            int birdIndex = scanner.nextInt();
            if (wireIndex > 0) {
                wires[wireIndex - 1] += birdIndex - 1;
            }

            if (wireIndex < n - 1) {
                wires[wireIndex + 1] += wires[wireIndex] - birdIndex;
            }

            wires[wireIndex] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(wires[i]);
        }

        scanner.close();
    }
}
