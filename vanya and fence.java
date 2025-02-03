import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of friends
        int h = scanner.nextInt(); // Height of the fence

        int minWidth = 0;
        for (int i=0; i<n; i++){
            int height = scanner.nextInt();
            if (height <= h){
                minWidth += 1;
            }
            else {
                minWidth += 2;
            }
        }
        System.out.println(minWidth);
        scanner.close();
    }
}
