import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] calories = new int[4];

        for (int i=0; i<4; i++){
            calories[i] = scanner.nextInt();
        }
        String s = scanner.next();
        int total = 0;
        for (char c : s.toCharArray()){
            int index = c - '1';
            total += calories[index];
        }
        System.out.println(total);
        scanner.close();
    }
}
