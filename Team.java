import java.util.Scanner;

public class Team {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int noOfProblems = scanner.nextInt();
        int maxSolution = 0;

        for (int i=0; i<noOfProblems; i++){
            int p = scanner.nextInt();
            int v = scanner.nextInt();
            int t = scanner.nextInt();

            if (p+v+t >= 2){
                maxSolution++;
            }
        }
        System.out.println(maxSolution);
        scanner.close();
    }
}
