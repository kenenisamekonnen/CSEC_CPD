import java.util.Scanner;

public class Magnet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int noOfMagnet = scanner.nextInt();
        int groups = 1;
        String previous = scanner.next();
        for (int i=1; i<noOfMagnet; i++){
            String current = scanner.next();
            if (!current.equals(previous)){
                groups++;
            }
            previous = current;
        }
        System.out.println(groups);
        scanner.close();
    }
}
