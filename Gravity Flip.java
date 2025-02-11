import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args){
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        int noOfColumn = scanner.nextInt();
        int[] noOfCube = new int[noOfColumn];
        for (int i=0; i<noOfColumn; i++){
            noOfCube[i] = scanner.nextInt();
        }
        Arrays.sort(noOfCube);
        for (int j : noOfCube) {
            System.out.println(j + " ");
        }
    }
}
