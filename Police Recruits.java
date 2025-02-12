import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int events = scanner.nextInt();
        int officers = 0;
        int untreated = 0;
        for (int i=0; i<events; i++){
            int event = scanner.nextInt();
            if (event == -1){
                if (officers > 0){
                    officers--;
                } else {
                    untreated++;
                }
            } else {
                officers += event;
            }
        }

        System.out.println(untreated);
        scanner.close();
    }
}
