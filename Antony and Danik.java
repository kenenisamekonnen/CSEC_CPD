
import java.util.Scanner;
import java.util.Stack;

public final class Antony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        Stack antony = new Stack<>();
        Stack danik = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'A'){
               antony.push(s.charAt(i));
            }
            if (s.charAt(i) == 'D'){
                danik.push(s.charAt(i));
            }
        }
        int antonySize = antony.size();
        int danikSize = danik.size();
        if (antonySize == danikSize){
            System.out.println("Friendship");
        }
        else if (antonySize > danikSize){
            System.out.println("Anton");
        }
        else {
            System.out.println("Danik");
        }
    }
}
