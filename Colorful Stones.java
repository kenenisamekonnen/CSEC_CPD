import java.util.Scanner;

public class ColorfulStones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int position = 0;

        for (int i = 0; i < t.length(); i++) {
            char instruction = t.charAt(i);

            if (s.charAt(position) == instruction) {
                position++;

                if (position == s.length()) {
                    break;
                }
            }
        }
        System.out.println(position + 1);
    }
}
