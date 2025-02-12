import java.util.Scanner;

public class StoneOnTheTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String colors = scanner.next();

        int removal = 0;

        for (int i=1; i<colors.length(); i++){
            if (colors.charAt(i) == colors.charAt(i-1)){
                removal++;
            }
        }
        System.out.println(removal);
        scanner.close();
    }
}
