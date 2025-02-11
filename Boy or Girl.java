import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        Set<Character> characters = new HashSet<>();

        for (int i=0; i<userName.length(); i++){
            characters.add(userName.charAt(i));
        }
        int n = characters.size();
        if (n%2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
