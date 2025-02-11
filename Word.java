import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int upperCase = 0;
        int lowerCase = 0;

        for (char ch : word.toCharArray()){
            if (Character.isUpperCase(ch)){
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
        }
        String newWord = "";
        if (lowerCase >= upperCase){
            newWord = word.toLowerCase();
        } else {
            newWord = word.toUpperCase();
        }
        System.out.println(newWord);
    }
}
